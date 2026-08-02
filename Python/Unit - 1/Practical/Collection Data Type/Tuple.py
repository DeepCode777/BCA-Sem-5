#tuple is an immutable, ordered collection of items written with round brackets ().

# 1. Creating a tuple (can hold mixed data types)
coordinates = (4, 10, "North")
print (coordinates)

# 2. Accessing elements using zero-based indexing
x_axis = coordinates[0]   # Returns 4
label = coordinates[-1]   # Returns "North" (negative indexing)

# 3. Tuple unpacking (assigning elements to variables)
x, y, direction = coordinates

print(f"X: {x}, Y: {y}, Direction: {direction}")
# Output: X: 4, Y: 10, Direction: North