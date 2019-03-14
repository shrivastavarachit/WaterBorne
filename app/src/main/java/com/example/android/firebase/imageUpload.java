package com.example.android.firebase;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;

public class imageUpload extends AppCompatActivity  {

    public Button sUploadBtn;
    public Button pUploadBtn;
    private boolean PHOTO_CODE_SUS=true;
    //public ImageView mImageView;

    private static final int CAMERA_REQUEST_CODE = 1;

    private StorageReference mStorage;
    private ProgressDialog mProgress;

    private StorageReference pStorage;
    private ProgressDialog pProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_upload);

        mStorage = FirebaseStorage.getInstance().getReference();
        pStorage = FirebaseStorage.getInstance().getReference();

        sUploadBtn = (Button)findViewById(R.id.supload);
        pUploadBtn = (Button)findViewById(R.id.pupload);
     //   mImageView = (ImageView)findViewById(R.id.imageView);
        mProgress = new ProgressDialog(this);

        sUploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CropImage.activity()
                        .setAspectRatio(1,1)
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setFixAspectRatio(true)
                        .start(imageUpload.this);
                PHOTO_CODE_SUS = true;

            }
        });

        pUploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CropImage.activity()
                        .setAspectRatio(1,1)
                        .setGuidelines(CropImageView.Guidelines.ON)
                        .setFixAspectRatio(true)
                        .start(imageUpload.this);
                PHOTO_CODE_SUS =false;

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {

            mProgress.setMessage("Uploading..");
            mProgress.show();

            CropImage.ActivityResult result = CropImage.getActivityResult(data);
            Uri resultUri = result.getUri();
            if(PHOTO_CODE_SUS)
            {
                StorageReference filepath = mStorage.child("Suspicious").child(resultUri.getLastPathSegment());
                filepath.putFile(resultUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        mProgress.dismiss();

                        Toast.makeText(imageUpload.this, "Uploading Finish..", Toast.LENGTH_LONG).show();
                    }
                });
            }
            else
            {
                StorageReference pfilepath = pStorage.child("Proof").child(resultUri.getLastPathSegment());
                pfilepath.putFile(resultUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        mProgress.dismiss();

                        Toast.makeText(imageUpload.this, "Uploading Finish..", Toast.LENGTH_LONG).show();
                    }
                });
            }


        }
    }
}
