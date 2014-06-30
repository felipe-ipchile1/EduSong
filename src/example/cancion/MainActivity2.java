package example.cancion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity2 extends Activity {

	 private RadioButton rb1, rb2, rb3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		
		rb1=(RadioButton)findViewById(R.id.rb1);
		rb2=(RadioButton)findViewById(R.id.rb2);
		rb3=(RadioButton)findViewById(R.id.rb3);
		
		 	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
	
	}
	


	 public void pregunta1(View view) {
	        
	        if (rb1.isChecked()==true) {
	        	Toast.makeText(getBaseContext(), "Well you're right question", Toast.LENGTH_SHORT).show(); 
	        	
	        	finish();

	        } else
	            if (rb2.isChecked()==true) {
	            	
	            	
	            	AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	    	        dialogo1.setTitle("Question - 1");  
	    	        dialogo1.setMessage("Do try it again failed");            
	    	        dialogo1.setCancelable(false); 
	    	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	    	            public void onClick(DialogInterface dialogo1, int id) {  
	    	                cancelar();
	    	            }  
	    	        });  
	    	        
	    	
	    	        dialogo1.show(); 

	                              
	       	
	            }else
	            	 if (rb3.isChecked()==true) {
	            		 
	            		 AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);  
	         	        dialogo1.setTitle("Question - 1");  
	         	        dialogo1.setMessage("Do try it again failed");            
	         	        dialogo1.setCancelable(false); 
	         	        dialogo1.setNegativeButton("OK", new DialogInterface.OnClickListener() {  
	         	            public void onClick(DialogInterface dialogo1, int id) {  
	         	                cancelar();
	         	            }  
	         	        });  
	         	        
	         	
	         	        dialogo1.show(); 

	            		                	
	    }    
     
	    }

	 public void cancelar() {
		 android.os.Process.killProcess(android.os.Process.myPid());
	    } 


}
