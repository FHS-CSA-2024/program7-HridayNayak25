public class BuckCoverterModulusupdated {
      private double outputA;
      private double outputB;
      private double outputC;

    public double convert(double nickel, double klevin, double buck) {
        double conversion = 0.0;

        // Nickels conversion
        if (nickel == 240.0) {
            double newKlevin = klevin + 1;
            nickel = 0;
            outputA = newKlevin; 
        } else if (nickel < 240.0) {
            double newNickel = nickel / 240.0;
            outputA = newNickel;
            nickel = 0;
        } else if (nickel > 240.0) {
            double newKlevin = (nickel / 240.0) + klevin;
            outputA = newKlevin;
          
            nickel = nickel % 240.0;  // thank you for the % idea sir!
        }

   
        if (klevin == 20.0) {
            double newBuck = buck + 1;
            klevin = 0;
            outputB = newBuck;
        } else if (klevin < 20.0) {
            double newKlevin = klevin / 20.0;
          
            outputB = newKlevin;
            klevin = 0;
        } else if (klevin > 20.0) {
            double newBuck = (klevin / 20.0) + buck;
            outputB = newBuck;
            klevin = klevin % 20.0;  
        }

      
        if (buck == 1) {
            outputC = buck;
        } else if (buck < 1) {
            outputC = buck;
        } else if (buck > 1) {
            outputC = buck;
        }

        
        conversion = outputC + outputB + outputA;
      
        return conversion;
    }

    
}


