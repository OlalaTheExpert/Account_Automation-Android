package com.example.menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    Menu myMenu;
    EditText selectItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    //This function is to create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        selectItem = (EditText)findViewById(R.id.popupmenu);

        return true;
    }

    //This function is for making the option menu clickable
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.item1)
        {
            Toast.makeText(this, "Home Selected", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item2)
        {
            Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item3)
        {
            Toast.makeText(this, "Contact Selected", Toast.LENGTH_SHORT).show();
        }

        return true;
    }

    //This is for option menu, this function will trigger once the gadget against this
    //function is clicked.
    public void btnPopup(View view) {
        PopupMenu popup = new PopupMenu(this, view);
        popup.getMenuInflater().inflate(R.menu.main_menu, popup.getMenu());
        popup.show();
	

	//This function is to make the popup menu clickable
        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.item1)
                {
                    selectItem.setText("VICTOR OLALA");
                    Toast.makeText(MainActivity.this, "VICTOR OLALA Selected", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.item2)
                {
                    selectItem.setText("SAMUEL NYANDORO");
                    Toast.makeText(MainActivity.this, "SAMUEL NYANDORO Selected", Toast.LENGTH_SHORT).show();
                }
                if (menuItem.getItemId() == R.id.item3)
                {
                    selectItem.setText("GODWIN MAINA");
                    Toast.makeText(MainActivity.this, "GODWIN MAINA Selected", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }
}