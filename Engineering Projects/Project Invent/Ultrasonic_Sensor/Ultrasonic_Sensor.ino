// C++ code
//
int echoPin = 8;
int trigPin = 9;
long duration, duration2, cm, inches, cm2, inches2;

void setup()
{
  Serial.begin (9600);
  pinMode(8, INPUT);  //echo pin 
  pinMode(9, OUTPUT); //trig pin
  
  pinMode(7, OUTPUT); //LED red CHANGNENE
  pinMode(7, OUTPUT); //LED black
    pinMode(7, OUTPUT); //LED green
    pinMode(7, OUTPUT); //LED blue 
  
  pinMode(6, INPUT);  //echo pin 2 CHANGENEGNENO
  pinMode(5, OUTPUT); //trig pin 2 CHANGNENENENE
}

void loop()
{
  
  digitalWrite(9, LOW); //trig off
  delayMicroseconds(5);
  digitalWrite(9, HIGH);//trig on
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  pinMode(8, INPUT); //recieve signal echo
  duration = pulseIn(8, HIGH); //counts microseconds to get there and go back
  
    //conversions
  cm = (duration/2)/29.1;
  inches = (duration/2)/74;
  
  Serial.print(inches);
  Serial.print("in, ");
  Serial.print(cm);
  Serial.print("cm");
  Serial.println();
  
  delay(250);
  
  
    digitalWrite(5, LOW); //trig off
  delayMicroseconds(5);
  digitalWrite(5, HIGH);//trig on
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  pinMode(6, INPUT); //recieve signal echo
  duration2 = pulseIn(6, HIGH); //counts microseconds to get
  
   //conversions
  cm2 = (duration2/2)/29.1;
  inches2 = (duration2/2)/74;
  
  Serial.print(inches);
  Serial.print("in, ");
  Serial.print(cm);
  Serial.print("cm");
  Serial.println();
  
  delay(250);
  
  if(inches<=3 && inches2<=3){
      digitalWrite(7, HIGH); //red ON
           digitalWrite(7, LOW);//black
                digitalWrite(7, LOW);//green
                     digitalWrite(7, LOW);//blue
  }
  else if(inches>3 && inches<=10 && inches2>3 && inches2<=10)
  {
      digitalWrite(7, LOW); //red
           digitalWrite(7, LOW);//black
                digitalWrite(7, HIGH);//green ON
                     digitalWrite(7, LOW);//blue
  }
  else{ //greater than 10
          digitalWrite(7, LOW); //red
           digitalWrite(7, LOW);//black
                digitalWrite(7, LOW);//green
                     digitalWrite(7, HIGH);//blue ON
  }
}
