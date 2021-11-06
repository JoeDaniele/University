class Plant:
    def __init__(self, plant_name, plant_cost):
        self.plant_name = plant_name
        self.plant_cost = plant_cost
    
    def print_info(self):
        print('Plant Information:')
        print('   Plant Name: ', self.plant_name)
        print('   Cost: ', self.plant_cost)

class Flower(Plant):
    def __init__(self, plant_name, plant_cost, is_annual, color_of_flowers):
        Plant.__init__(self, plant_name, plant_cost)
        self.is_annual = is_annual
        self.color_of_flowers = color_of_flowers
    
    def print_info(self):
        print('Plant Information:')
        print('   Plant Name: ', self.plant_name)
        print('   Cost: ', self.plant_cost)
        print('   Annual: ', self.is_annual)
        print('   Color of Flowers', self.color_of_flowers)
        
def printlist(plant_names):
    for plant in plant_names:
        plant.print_info()
        print("\n")

if __name__ == "__main__":
    my_garden = []
    user_string = input()
    
    while user_string != '-1':
        info = user_string.split()
        if info[0] == "plant":
            plant_name = info[1]
            plant_cost = info[2]
            new = Plant(plant_name, plant_cost)
            
        if info[0] == "flower":
            plant_name = info[1]
            plant_cost = info[2]
            is_annual = info[3]
            color_of_flowers = info[4]
            new = Flower(plant_name, plant_cost, is_annual, color_of_flowers)
        
        my_garden.append(new)
        user_string = input()
    
    printlist(my_garden)