# 1. Creating a dictionary
student = {
    "name": "Alice",
    "age": 21,
    "major": "Computer Science",
    "gpa": 3.8
}

# 2. Accessing a value using its key
print(student["name"])      # Output: Alice

# 3. Adding a new key-value pair
student["grad_year"] = 2027

# 4. Modifying an existing value
student["gpa"] = 3.9

# 5. Removing a key-value pair
del student["age"]

# 6. Printing the updated dictionary
print(student)
# Output: {'name': 'Alice', 'major': 'Computer Science', 'gpa': 3.9, 'grad_year': 2027}
