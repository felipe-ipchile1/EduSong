package example.cancion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity8 extends Activity {
	
	private RadioButton rb19, rb20, rb21;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main8);
		
		rb19=(RadioButton)findViewById(R.id.rb19);
		rb20=(RadioButton)findViewById(R.id.rb20);
		rb21=(RadioButton)findViewById(R.id.rb21);
	}
	
	
	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

	
public void pregunta7(View view){
		
		if(rb19.isChecked()==true){
			
			AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	        dialogo1.setTitle("Question - 7");  
	        dialogo1.setMessage("Do try it again failed");            
	        dialogo1.setCancelable(false); 
	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	            public void onClick(DialogInterface dialogo1, int id) {  
	                cancelar();
	            }  
	        });  
	        

	        dialogo1.show(); 

	                      
		
	    }else
	    	 if (rb21.isChecked()==true) {
	    		 
	    		AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	 	        dialogo1.setTitle("Question - 7");  
	 	        dialogo1.setMessage("Do try it again failed");            
	 	        dialogo1.setCancelable(false); 
	 	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	 	            public void onClick(DialogInterface dialogo1, int id) {  
	 	                cancelar();
	 	            }  
	 	        });  
	 	        
	 	
	 	        dialogo1.show(); 

	    		                	
	} else
		 if (rb20.isChecked()==true) {
	     	Toast.makeText(getBaseContext(), "Well you're right question", Toast.LENGTH_SHORT).show(); 
	     	
	     	finish();}
	}
			
			
	public void cancelar() {
			 android.os.Process.killProcess(android.os.Process.myPid());
		    } 	
			
	
}
