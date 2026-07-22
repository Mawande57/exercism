
EXPECTED_BAKE_TIME = 40 
PREPARATION_TIME =2 


def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.
    
    Parameters:
        elapsed_bake_time (int): The amount of time the lasagna has been in the oven 
      
    
    Returns:
        int: The remaining baking time 

    This function takes elapsed baking time and calculates the remaining baking time
    by using the expacted bake time 
    
    """
    bake_time_remaining_ =  EXPECTED_BAKE_TIME - elapsed_bake_time
    return bake_time_remaining_
   

def preparation_time_in_minutes(number_of_layers):
    """Calculate the elapsed cooking time.
    
    Parameters:
        number_of_layers (int): The number of layers in the lasagna.
        
    
    Returns:
        int: The prep_time (in minutes) preparing 

        
    This fnction that takes the number_of_layers you want to add to the lasagna as an        argument and returns how many minutes you would spend making them.
    
    """
    prep_time  = number_of_layers * PREPARATION_TIME
    return prep_time 
   
#TODO (student): define the 'elapsed_time_in_minutes()' function below.
def elapsed_time_in_minutes(number_of_layers ,elapsed_bake_time):
    """Calculate the elapsed cooking time.
    
    Parameters:
        number_of_layers (int): The number of layers in the lasagna.
        elapsed_bake_time (int): Time the lasagna has been baking in the oven.
    
    Returns:
        int: The total time elapsed (in minutes) preparing and baking.

    This function takes two integers representing the number of lasagna 
    layers and the time already spent baking the lasagna. It calculates 
    the total elapsed minutes spent cooking (preparing + baking).
    
    """
    time_elpsed = preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
    return time_elpsed



# TODO (student): Remember to go back and add docstrings to all your functions
#  (you can copy and then alter the one from bake_time_remaining.)
