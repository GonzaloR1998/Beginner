package imcalculator;

import java.math.BigDecimal;

public class Parameters {
    
    
    public Parameters()
    {
        height = 0;
        weight = 0.0f;
        composition = "N/A";
        
        
    }
    
    private float height;
    private float weight;
    private String composition;
    
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }
    
    
    
    public float GetIMC()
    { float imc;
    
      
      imc = weight / ((height * height) / 10000);
      
      if (imc<18.5f)
      {
          composition = "Underweight";
      }
      
      else if (imc>=18.5f && imc<=24.9f)
      {
          composition = "Normal Weight";
      }
      
      else if (imc>=25f && imc<=29.9f)
      {
          composition = "Overweight";
      }
      
      else if (imc>=30f && imc<=39.9f)
      {
          composition = "Obesity";
      }
      
      else {
          composition = "Extreme Obesity";
      }
      return imc;
        
    }
    
    
}
