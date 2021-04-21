/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasygame;

/**
 *
 * @author amanda
 */
public class Creature {
    
    private int strength;
    private int hitPoints;
    private int damage;
    private String name;
    private String species;
    private boolean dead;
    
    Creature(String newName,String newSpecies, int newStrength, int newHit)
    throws IllegalArgumentException{
        name=newName;
        species = newSpecies;
        strength =newStrength;
        hitPoints = newHit;
    }
    
   public String getSpecies(){
       return species;
       }
   
  void setStrength(int newStrength)throws IllegalArgumentException{
      if(newStrength<0){
      strength = newStrength;
      }
      else{
          throw new IllegalArgumentException();
          }
  }
  
  public int getStrength(){
     return strength;
  }
  
  void setHitPoints(int newHit)throws IllegalArgumentException{
      hitPoints = newHit;
  }
  
  public int getHitPoints(){
      return hitPoints;
  }

  public int getDamage(){
    if(species.equals("Balrogs") || species.equals("Balrogs")) {
        if(Math.random() > .95) {
                damage = 50 + (int)(1+Math.random()*hitPoints);
        }
        else {
                damage = (int)(1+Math.random()*hitPoints);
        }
    }
    if(species.equals("Elves")) {
        if(Math.random() <.1) {
                damage = 2*(int)(1+Math.random()*hitPoints);
        }
        else {
        damage = (int)(1+Math.random()*hitPoints);
    }
    }
    else {
        damage = (int)(1+Math.random()*hitPoints);
    }
    return damage;
    }

 void Damage(int damage) throws IllegalArgumentException{
    
  }

 boolean isDead(){
    if (strength == 0){
        return true;
    }
    else{
        return false;
    }
    
 }

 String getName(){
        return name;
     
 }

 boolean isNamed(String aName){
        if (name.equals(aName)){
            return true;
        }
        else{
            return false;
        }
 }
}
 
