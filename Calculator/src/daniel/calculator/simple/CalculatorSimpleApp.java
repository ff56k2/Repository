//CalculatorSimpleApp.java

package daniel.calculator.simple;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import android.view.View;
import android.widget.*;

public class CalculatorSimpleApp extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
      //get the two controls we created earlier, also with the resource reference and the id
        final TextView tv_View = (TextView)findViewById(R.id.tv_View);
        final EditText number1 = (EditText)findViewById(R.id.number1);
        final EditText number2 = (EditText)findViewById(R.id.number2);
        final Button AddButton = (Button)findViewById(R.id.AddButton);
        final Button MinusButton = (Button)findViewById(R.id.MinusButton);
        final Button MultiplyButton = (Button)findViewById(R.id.MultiplyButton);
        final Button DivideButton = (Button)findViewById(R.id.DivideButton);
        AddButton.setBackgroundColor(0xFF767676);
        MinusButton.setBackgroundColor(0xFF4E4E4E);
        MultiplyButton.setBackgroundColor(0xFF767676);
        DivideButton.setBackgroundColor(0xFF4E4E4E);
        
        //Code for Add Button
        AddButton.setOnClickListener(new View.OnClickListener() {
            
    	  public void onClick(View v) {
    		  Double buffer = 0.0, n1,n2;
    		  		  if (number1.getText().toString().equals("")){
    		  			  n1 = 0.0;
    		  		  }
    		  		  else {
    		  			  n1 = Double.parseDouble(number1.getText().toString());
    		  		  }
    		  		  
    		  		  if (number2.getText().toString().equals("")){
  		  			    n2 = 0.0;
  		  		      }
  		  		      else {
  		  			    n2 = Double.parseDouble(number2.getText().toString());
  		  		      }
    			
    				  buffer = n1 + n2;
    				  tv_View.setText("Result = " + Double.toString(buffer)); 
    				  number1.setText("");
    				  number2.setText("");
    	  }
    			  
    		  
    		
    	  
      });
        
        MinusButton.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View v) {
      		  Double buffer = 0.0, n1,n2;
      		  		  if (number1.getText().toString().equals("")){
      		  			  n1 = 0.0;
      		  		  }
      		  		  else {
      		  			  n1 = Double.parseDouble(number1.getText().toString());
      		  		  }
      		  		  
      		  		  if (number2.getText().toString().equals("")){
    		  			    n2 = 0.0;
    		  		      }
    		  		      else {
    		  			    n2 = Double.parseDouble(number2.getText().toString());
    		  		      }
      			
      				  buffer = n1 - n2;
      				  tv_View.setText("Result = " + Double.toString(buffer)); 
      				  number1.setText("");
      				  number2.setText("");
      	  }
      			  
      		  
      		
      	  
        });
        
        MultiplyButton.setOnClickListener(new View.OnClickListener() {
            
        	public void onClick(View v) {
      		  Double buffer = 0.0, n1,n2;
      		  		  if (number1.getText().toString().equals("")){
      		  			  n1 = 0.0;
      		  		  }
      		  		  else {
      		  			  n1 = Double.parseDouble(number1.getText().toString());
      		  		  }
      		  		  
      		  		  if (number2.getText().toString().equals("")){
    		  			    n2 = 0.0;
    		  		      }
    		  		      else {
    		  			    n2 = Double.parseDouble(number2.getText().toString());
    		  		      }
      			
      				  buffer = n1 * n2;
      				  tv_View.setText("Result = " + Double.toString(buffer)); 
      				  number1.setText("");
      				  number2.setText("");
      	  }
      			  
      		  
      		
      	  
        });
        
        DivideButton.setOnClickListener(new View.OnClickListener() {
            
      	  public void onClick(View v) {
      		  Double Doublebuffer = 0.0,f1,f2;
      		  		
      		  		if (number1.getText().toString().equals("")){
      		  			f1 = 0.0;
      		  		}
      		  		else {
      		  			f1 = Double.parseDouble(number1.getText().toString());
      		  		}
      		  		
      		  		if (number2.getText().toString().equals("")){
      		  			f2 = 0.0;
  		  			}
  		  			else {
  		  				f2 = Double.parseDouble(number2.getText().toString());
  		  			}
      		  
      				  if (f2 != 0){
      				  Doublebuffer = f1 / f2;
      				  tv_View.setText("Result = " + Double.toString(Doublebuffer)); 
      				 
      				  }
      				  else {
      					tv_View.setText("Result = Dividing by 0? Apocalypse in 3...2...1...");
      				  }
      				 number1.setText("");
     				 number2.setText("");
      	  }
      			  
      		  
      		
      	  
        });
    }
}