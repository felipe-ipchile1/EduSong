package example.cancion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity5 extends Activity {
	
	private RadioButton rb10, rb11, rb12;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main5);
		
		rb10=(RadioButton)findViewById(R.id.rb10);
		rb11=(RadioButton)findViewById(R.id.rb11);
		rb12=(RadioButton)findViewById(R.id.rb12);
	}

	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	
	
public void pregunta4(View view){
		
		if(rb10.isChecked()==true){
			
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	        dialogo1.setTitle("Question - 4");  
	        dialogo1.setMessage("Do try it again failed");            
	        dialogo1.setCancelable(false); 
	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                cancelar();
	            }  
	        });  
	        

	        dialogo1.show(); 

	                      
		
	    }else
	    	 if (rb12.isChecked()==true) {
	    		 
	    		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	 	        dialogo1.setTitle("Question - 4");  
	 	        dialogo1.setMessage("Do try it again failed");            
	 	        dialogo1.setCancelable(false); 
	 	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	 	            public void onClick(DialogInterface dialogo1, int id) {  
	 	                cancelar();
	 	            }  
	 	        });  
	 	        
	 	
	 	        dialogo1.show(); 

	    		                	
	} else
		 if (rb11.isChecked()==true) {
	     	Toast.makeText(getBaseContext(), "Well you're right question", Toast.LENGTH_SHORT).show(); 
	     	
	     	finish();}
	}
			
			
	public void cancelar() {
			 android.os.Process.killProcess(android.os.Process.myPid());
		    } 	
		
	
}
