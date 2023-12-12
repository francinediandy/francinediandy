  import java.awt.*;
  
  public class Robot{
 
  
   
   int vitesse;
   String nom;
   private Point position;
   
    public Robot (String MonRobot){
    nom=MonRobot;
    position=new point(0,0);
    vitesse=0;
    }
    
     public Robot (String MonRobot,int x,int b,int vitesse){
    nom=MonRobot;
    position=new point(x,y);
    vitesse=vitesse;
    this.vitesse=vitesse;
    }
    
    public void allerAlEst(){
    position.translate(vitesse,0);
    }
    
     public void allerAlOuest(){
    position.translate(-vitesse,0);
    
    }
     public void allerAuNord(){
    position.translate(0,-vitesse);
    }
     public void allerAuSud(){
    position.translate(0,-vitesse);
    }
    
    public void accelerer(){
    if(vitesse<10)
    vitesse++;
    }
    public void deccelerer(){
    if(vitesse==0){
    stop ();
    vitesse--;
    public void stop(){
    vitesse=0;
    }
    
    public point getposition(){
    return position;
    }
    public point sePresenter(){
    System.out.println("nom":+ nom +"position:"+ position);
    }
    public class Robot (){
    private String nom;
    private point position;
    private int vitesse;
    private int niveau;
    public Robot(String nom,int vitesse){
    this.nom=nom;
    this.vitesse=vitesse;
    this.position=new Point(0,0);
    this. niveau=100;
   
    }

    public void allerALEst() {
        if (niveau > 0) {
            position.x += vitesse;
            niveau--;
        } else {
            System.out.println("Je n'ai plus de combustible pour me déplacer !");
        }
    }

    public void allerALOuest() {
        if (niveau > 0) {
            position.x -= vitesse;
      
        }
    }

    public void allerALOuest() {
        if (niveau > 0) {
            position.x -= vitesse;
            niveau--;
        } else {
            System.out.println("Je n'ai plus de combustible pour me déplacer !");
        }
    }

    public void allerAuNord() {
        if (niveau > 0) {
            position.y += vitesse;
            niveau--;
        } else {
            System.out.println("Je n'ai plus de combustible pour me déplacer !");
        }
    }

    public void allerAuSud() {
        if (niveau > 0) {
            position.y -= vitesse;
            niveau--;
        } else {
            System.out.println("Je n'ai plus de combustible pour me déplacer !");
        }
    }

    public void accelerer() {
        vitesse++;
    }

    public void decelerer() {
        if (vitesse > 0) {
            vitesse--;
        }
    }

    public void stop() {
        vitesse = 0;
        sePresenter();
    }

    public Point getPosition() {
        return position;
    }

    public void sePresenter() {
        System.out.println("Je suis le robot " + nom + " et ma position est (" + position.x + ", " + position.y + ")");
    }

    public void setNiveau(int n) {
        niveau = n;
    }

    public int getNiveau() {
        return niveau;
    }

    public void sePromener() {
        while (niveau > 0) {
            double random = Math.random();
            switch ((int) (random * 4)) {
                case 0:
                    allerALEst();
                    break;
}
}
}

    
   

