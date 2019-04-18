int bullseyeX1=100;
int bullseyeX2=900;
void setup(){
  
  size(1000,1000);
  
  
}



void draw(){
 background(#FFFFFF);
  bullseyeX1++;
  bullseyeX2--;
for(int i = 10; i < 500; i += 5){
 noFill();
 ellipse(bullseyeX1, 500 , i, i);
 ellipse(bullseyeX2, 500, i, i);
} 

}