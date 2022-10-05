package adicao.app.android;

import android.app.*;
import android.os.*;


import android.app.*;
import android.os.*;



import android.app.Activity;
import android.os.Bundle;


import android.app.Activity; 
import android.view.View; 
import android.view.View.OnClickListener; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.TextView;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.io.IOException;

import android.text.ClipboardManager;
import android.content.ClipData;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);



		final Button B = (Button)findViewById(R.id.button1); 

		final EditText ED = (EditText)findViewById(R.id.text1);
		final EditText ED2 = (EditText)findViewById(R.id.text2);
		final TextView TV = (TextView)findViewById(R.id.tv1);

		B.setOnClickListener(new OnClickListener(){ 
				@Override 
				public void onClick(View arg0)
				{ 
					try
					{

						String s="",ss="";
						boolean b=false;
						int l1;
						int l2;
						char cc=0;
						boolean b2=false;
						String TextEntered = ED.getText().toString().replaceAll("'","")+".0"; 
						String TextEntered2 = ED2.getText().toString().replaceAll("'","")+".0"; 
			
						String ssss="";
						String[] temp1;
						String delimiter = "\\.";
						String[] temp2;
						temp1 = TextEntered.split(delimiter);
						temp2 = TextEntered2.split(delimiter);
						ssss=func6(temp1[1],temp2[1]);
						boolean bbb=false;
						if (ssss.indexOf(".",0)>-1)bbb=true;
						s=func5(temp1[0],temp2[0],bbb);
						String s1=s+"."+ssss;
						if(bbb)s1=s+ssss;
					
						TV.setText(s1);







					}
					catch (Exception e)
					{




						TV.setText(e.getMessage());

					}



				} 
			}); 

			
			

    }
	
	private String func6(String TextEntered,String TextEntered2)
	{

		String sss="";
		String s="",ss="";
		boolean b=false;
		int l1;
		int l2;
		char cc=0;
		boolean b2=false;

		TextEntered =TextEntered+"0000000000000000000000000000000000000000000000" ;
		TextEntered2 = TextEntered2+"0000000000000000000000000000000000000000000000";
		if (TextEntered.length() > 45+43 || TextEntered2.length() > 45+43)b2 = true;


		l1 = TextEntered.length() - 45;
		l2 = TextEntered2.length() - 45;
		TextEntered2 = TextEntered2.substring(0,43);

		TextEntered = TextEntered.substring(0,43);
		TextEntered2 = func(TextEntered2);
		TextEntered = func(TextEntered);
		if (b2)s = "erro";
		else
		{
			for (l1 = 0;l1 < TextEntered.length();l1++)
			{
				char c20=TextEntered.charAt(l1);

				char c21=TextEntered2.charAt(l1);


				if(c20>'0'-1 && c20<'9'+1 && c21>'0'-1 && c21<'9'+1)cc = func2(c20,c21, b);
else cc=255;
				if (cc == 255 || b2)
				{b2 = true;
					s = "erro";
					l1 = TextEntered.length() + 1;
				}
				else
				{
					b = false;
					if (cc > '9')
					{
						b = true;
						l2 = cc - '9';
						l2 = l2 + ('0' - 1);
						cc = (char)l2;
					}
					s = s + cc;
				}
			}}
			
			boolean bb=b;
		if (!b2)
		{
			
			
			s = func4(s);
			s = func(s);
			s = func3(s);
		}

		if (bb)s="."+s;
		return s;
	}
	
	
	private String func5(String TextEntered,String TextEntered2,boolean v1)
	{
		
		String sss="";
		String s="",ss="";
		boolean b=v1;
		int l1;
		int l2;
		char cc=0;
		boolean b2=false;

		TextEntered ="0000000000000000000000000000000000000000000000" + TextEntered;
		TextEntered2 ="0000000000000000000000000000000000000000000000" + TextEntered2;
		if (TextEntered.length() > 45+43 || TextEntered2.length() > 45+43)b2 = true;
		
		
		l1 = TextEntered.length() - 45;
		l2 = TextEntered2.length() - 45;
		TextEntered2 = TextEntered2.substring(l2, TextEntered2.length());

		TextEntered = TextEntered.substring(l1, TextEntered.length());
		TextEntered2 = func(TextEntered2);
		TextEntered = func(TextEntered);
		if (b2)s = "erro";
		else
		{
			for (l1 = 0;l1 < TextEntered.length();l1++)
			{
				
				char c20=TextEntered.charAt(l1);

				char c21=TextEntered2.charAt(l1);


				if(c20>'0'-1 && c20<'9'+1 && c21>'0'-1 && c21<'9'+1)cc = func2(c20,c21, b);
else cc=255;
				if (cc == 255 || b2)
				{b2 = true;
					s = "erro";
					l1 = TextEntered.length() + 1;
				}
				else
				{
					b = false;
					if (cc > '9')
					{
						b = true;
						l2 = cc - '9';
						l2 = l2 + ('0' - 1);
						cc = (char)l2;
					}
					s = s + cc;
				}
			}}
		boolean bb=b;
			
		if (!b2)
		{
			s = func3(s);
			s = func(s);
			s = func4(s);
			
		}
		
		if (s=="")s="0";
		if (bb)s="numero muito grande";
		
		return s;
	}
	private String func4(String ss)
	{
		String sss="";
		boolean b=false;
		int i=0;
		for (i = 0;i < ss.length();i++)
		{
			if (ss.charAt(i) != '0' && ss.charAt(i) != '\'') b = true;
			if (b)sss = sss + ss.charAt(i);
		}
		return sss;
	}

	private String func3(String ss)
	{
		String sss="";
		int f=0;
		int contador=0;
		for (f = 0;f < ss.length();f++)
		{
			sss = sss + ss.charAt(f);
			contador++;
			if (contador > 2)
			{
				contador = 0;
				sss = sss + "'";
			}
		}
		return sss;
	}




	private char func2(char c1, char c2, boolean b)
	{
		char cc='0';
		int i1=c1 - '0';
		int i2=c2 - '0';
		int i3='9' + 10;

		i1 = i1 + i2;

		if (b)i1++;
		if (i1 > 19) i1 = 255;
		if (i1 != 255) i1 = '0' + i1;
		cc = (char)i1;
		return cc;
	}



	private String func(String ss)
	{
		int i;
		String s="";
		try
		{
			for (i = ss.length() - 1;i > -1;i--)
			{
				s = s + ss.charAt(i);
			}
		}
		catch (Exception e)
		{
			setTitle(e.toString());
		}
		return s;
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    

