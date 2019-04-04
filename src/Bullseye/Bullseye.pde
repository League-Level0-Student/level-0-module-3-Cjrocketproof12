void setup(){
  
  size(1000,1000);
  
  
}



void draw(){
for(int i = 100; i < 1000; i += 200){
  
  fill(255, 0, 0);
  ellipse(500, 500, i, i);
  
  
}
for(int i = 100; i < 1000; i +=100){
  
  fill(#000000);
  ellipse(500, 500, i, i);
  fill(255, 0, 0);
  ellipse(500, 500, i, i);
}
} 