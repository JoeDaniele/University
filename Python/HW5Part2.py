names = ['Joe', 'Frank', 'Domino', 'Claudius', 'Lennox', 'Lewis ', 'Mike', 'Tyson', 'Floyd', 'Mayweather']
print(names)
listIndex = int(input("Enter list index: "))
try:
    print("Name: " + names[listIndex])
except:
    if listIndex > len(names):
        print("Exception! list index out of range.")
        print("The closest name is: " + names[-1])
    else:
        print("Exception! list index out of range.")
        print("The closest name is: " + names[0])

        # Pretty straightforward, a list of names are presented and the user is asked to provide an index
        # if that index is outside the confines of the array, an error is thrown
        # followed by the closest name to their input
