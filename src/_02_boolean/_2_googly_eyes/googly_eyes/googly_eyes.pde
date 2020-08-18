PImage face;
void setup() {
  face = loadImage("googlyeyes.png");
  size(800,600);
  face.resize(width,height);
}

void draw() {
  background(face);
}
