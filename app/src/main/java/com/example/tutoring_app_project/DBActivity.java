package com.example.tutoring_app_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DBActivity extends AppCompatActivity {

    EditText name, contact, grade;
    Button insert, update, delete, view;
    DBHelper DB;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbactivity);

        name = findViewById(R.id.name);
        contact = findViewById(R.id.contact);
        grade = findViewById(R.id.grade);

        insert = findViewById(R.id.btnInsert);
        update = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        DB = new DBHelper(this);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String gradeTXT = grade.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(nameTXT, contactTXT, gradeTXT);
                if(checkinsertdata==true)
                    Toast.makeText(DBActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(DBActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }
        });
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String gradeTXT = grade.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(nameTXT, contactTXT, gradeTXT);
                if(checkupdatedata==true)
                    Toast.makeText(DBActivity.this, "Entry Updated", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(DBActivity.this, "Entry Not Updated", Toast.LENGTH_SHORT).show();
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();

                Boolean checkdeletedata = DB.deleteuserdata(nameTXT);
                if(checkdeletedata==true)
                    Toast.makeText(DBActivity.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(DBActivity.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }
        });
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0) {
                    Toast.makeText(DBActivity.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Contact :"+res.getString(1)+"\n");
                    buffer.append("Grade :"+res.getString(2)+"\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(DBActivity.this);
                builder.setCancelable(true);
                builder.setTitle("User Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });




    }
}