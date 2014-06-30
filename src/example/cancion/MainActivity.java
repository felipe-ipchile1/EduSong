package example.cancion;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
 
public class MainActivity extends Activity {
        Button b1;
        Button b2;
        TextView tiempo;
        int h=0,m=0,s=0;
        MediaPlayer mepe;
    	int pos = 0;

        boolean bandera=true;
       
   
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1= (Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        tiempo=(TextView)findViewById(R.id.tv1);
   
        b1.setOnClickListener(empieza);
        b2.setOnClickListener(para);}
    

    public boolean onCreateOptionsMenu(Menu menu) {
           // Inflate the menu; this adds items to the action bar if it is present.
           getMenuInflater().inflate(R.menu.main, menu);
           return true;
       }
    
    public void destruir() {
        if (mepe != null)
            mepe.release();
    }
    
    public void hilador(){
    	mepe = MediaPlayer.create(this, R.raw.tv);
        Thread cronometro = new Thread(){
            public void run(){
                    try{
                            while(bandera==true){
                            handler.post(proceso);
                            Thread.sleep(1000);
                            }
                    }
                    catch(Exception e){
                            Toast b=Toast.makeText(getApplicationContext(), e.toString(), 2000);
                            b.show();
                    }
            }
        };
       cronometro.start(); }
    
    
    Handler handler = new Handler();
    
    Runnable proceso = new Runnable(){
                public void run() {
                        try{
                        	
            tiempo.setText(" "+h+" : "+m+" : "+s);
            s++;
            if(s==60){m++;s=0;}
            if(m==60){h++;m=0;}
                                
            if(m==0 && s==17 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                    
               		
            if(m==0 && s == 23 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                     
            if(m==0 && s== 33 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                
                                
            if(m==0 && s== 43 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                
                                
            if(m==0 && s== 57 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                
                                
            if(m==1 && s==27 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                
                                
            if(m==1 && s == 40 && mepe.isPlaying()){
            pos = mepe.getCurrentPosition();
            mepe.pause();
            bandera=false;
            tiempo.setText("-->"+h+" : "+m+" : "+s);}
                                
            if(m==1 && s==55) {
         
              android.os.Process.killProcess(android.os.Process.myPid());
              	    
            }
            
            
            
                           }
                        
                        
                        
            catch(Exception e){                    
            Toast b=Toast.makeText(getApplicationContext(), e.toString(), 2000);
            b.show();     }
                }};
              
                
                
                OnClickListener empieza =new OnClickListener(){
                    public void onClick(View arg0) {
                            bandera=true;
                            hilador();
                            if(s==0){mepe.start();}
                            b1.setOnClickListener(continua);
                            b1.setText("Continue");}};
                            
                OnClickListener pausa =new OnClickListener(){
                    public void onClick(View arg0) {
                            bandera=false;
                            tiempo.setText("-->"+h+" : "+m+" : "+s);
                            {pos = mepe.getCurrentPosition();
                             mepe.pause();}
                             b1.setText("Continue");
                             b1.setOnClickListener(continua);}};
                                        
                                        
                 OnClickListener continua =new OnClickListener(){
                    public void onClick(View arg0) {
                    bandera=true;
                    tiempo.setText("-->"+h+" : "+m+" : "+s);
                    hilador();
                    if(mepe != null && mepe.isPlaying()==false){
        			mepe.seekTo(pos);
        			mepe.start();
        		    tiempo.setText(""+h+" : "+m+" : "+s);}};};
                                                    
                OnClickListener para =new OnClickListener(){
                public void onClick(View arg0) {
                    bandera=false;
                    tiempo.setText("Time");
                    m=0;s=m;h=m;   
                    if(mepe != null){
                    mepe.stop();
                    pos = 0;}
                    b1.setText("Start");
                    b1.setOnClickListener(empieza);}};
        
  
              public void preguntas(View view) {
                                                            	   
                if(m==0 && s==17){   
                   
                	Intent i = new Intent(this, MainActivity2.class );
                    startActivity(i);}
                                                            		
                if(m==0 && s<17) {
                                                       	        
             Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
                                                            		
                if(m==0 && s==23){
                                                            	    	 
    	    	     Intent i = new Intent(this, MainActivity3.class );
                     startActivity(i);
                                                              		}
                                                            	     
        	    if(m==0 && s>17 && s<23){
                                                              	    
  			 Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
                                                            	    
    	        if(m==0 && s==33){
                                                            	    	
                  	 Intent i = new Intent(this, MainActivity4.class );
                     startActivity(i);
                                                            	    	
                                                                     }
                                                            	    
                if(m==0 && s>23 && s<33){
                                                            	    	
                                                            	    	
              Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
                                                            	    
                if(m==0 && s==43){
                     
                	 Intent i = new Intent(this, MainActivity5.class );
                     startActivity(i);
                                                            	    	
                                                            	    }
                                                            	    
                if(m==0 && s>33 && s<43){
                	
                Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
                                                            	    	
                if(m==0 && s==57){
                	
                	Intent i = new Intent(this, MainActivity6.class );
                    startActivity(i);
                
                                                                    }                                    	   
                if(m==0 && s>43 && s<57){
                	
                Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
                
                if(m==1 && s==27){
                	
                	Intent i = new Intent(this, MainActivity7.class );
                    startActivity(i);
                }
                
                if(m==1 && s<27){
                	
                	 Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
              
                if(m==1 && s==40){
                	
                	Intent i = new Intent(this, MainActivity8.class );
                    startActivity(i);
                }
                
                if(m==1 && s>27 && s<40){
              
                	Toast.makeText(getBaseContext(), "Wait for the song to stop, thanks", Toast.LENGTH_SHORT).show();}
              
                if(m==1 && s>40 && s<54){
                	
                	
                	Toast.makeText(getBaseContext(), "There are no more questions, thanks for playing", Toast.LENGTH_SHORT).show();
                	
                	
                }
                
              }
                                                            	    
              
              
              }
            


                                                            	   
                                                            	   
                                                               
                                                              




