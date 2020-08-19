PImage face;
void setup() {
  face = loadImage("googlyeyes.png");
  size(800,600);
  face.resize(width,height);
}

void draw() {
  background(face);
  if(mousePressed){
   print(mouseX,mouseY);
  }
  
  if(mouseX < 180){
    mouseX = 180;
  }
  if(mouseY < 270){
    mouseY = 270;
  }
  if(mouseX > 242){
    mouseX = 242;
  }
  if(mouseY > 333){
   mouseY = 333; 
  }
  fill(255,255,255);
  ellipse(211,300,80,80);
  fill(0,0,0);
  ellipse(mouseX,mouseY,10,10);
  fill(255,255,255);
  ellipse(369,303,80,80);
  fill(0,0,0);
  ellipse(mouseX+150,mouseY,10,10);
  
}
