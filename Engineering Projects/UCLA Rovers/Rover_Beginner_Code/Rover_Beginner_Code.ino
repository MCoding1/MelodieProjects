#include <ECE3.h>

//SPEED 
const int left_nslp_pin=31; // nslp ==> awake & ready for PWM
const int left_dir_pin=29;
const int left_pwm_pin=40;

const int right_nslp_pin=11; // nslp ==> awake & ready for PWM
const int right_dir_pin=30;
const int right_pwm_pin=39;

const int LED_RF = 41;
const int LED_RR = 57;

void setup()
{
  ECE3_Init();

  pinMode(left_nslp_pin,OUTPUT);
  pinMode(left_dir_pin,OUTPUT);
  pinMode(left_pwm_pin,OUTPUT);

  pinMode(right_nslp_pin,OUTPUT);
  pinMode(right_dir_pin,OUTPUT);
  pinMode(right_pwm_pin,OUTPUT);

  digitalWrite(left_dir_pin,LOW);
  digitalWrite(left_nslp_pin,HIGH);

  digitalWrite(right_dir_pin,LOW);
  digitalWrite(right_nslp_pin,HIGH);

  pinMode(LED_RF, OUTPUT);
 
  //Serial.begin(9600); // set the data rate in bits per second for serial data transmission
  delay(2000);
}

void Stop()
{
    analogWrite(left_pwm_pin,0);
    analogWrite(right_pwm_pin,0);
}

void Right()
{
  analogWrite(left_pwm_pin,90);
  analogWrite(right_pwm_pin,0);
}

void Left()
{
  analogWrite(left_pwm_pin,0);
  analogWrite(right_pwm_pin,90);
}

void Forward()
{
  analogWrite(left_pwm_pin,90);
  analogWrite(right_pwm_pin,90);
}

void loop()
{
 Forward();
 delay(1000);
 Stop();
 delay(1000);
 Right();
 delay(5000);
 Forward();
 delay(1000);
}
