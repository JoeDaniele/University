names = ['Joe', 'Frank', 'Domino', 'Claudius', 'Lennox', 'Lewis ', 'Mike', 'Tyson', 'FLoyd', 'Mayweather']
listIndex = int(input("Enter list index:"))
try:
    print("Name: " + names[listIndex])  # print name of given list index
except:
    if listIndex > len(names):  # checking list index
        print("Exception! list index out of range.")
        print("The closest name is: " + names[-1])  # print last name
    else:
        print("Exception! list index out of range.")
        print("The closest name is: " + names[0])  # print first name
