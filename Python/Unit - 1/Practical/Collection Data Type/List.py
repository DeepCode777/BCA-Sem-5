# 1. CREATION: Initialize a mixed-type list
data = ["Python", 2026, True, 3.14]

# 2. ACCESS: Read elements via positive and negative indexing
first_item = data[0]   # 'Python'
last_item = data[-1]   # 3.14

# 3. MODIFICATION: Update an existing element by index
data[1] = 2027         # List becomes: ["Python", 2027, True, 3.14]

# 4. ADDITION: Insert new elements at the end and at a specific index
data.append("AI")      # List becomes: ["Python", 2027, True, 3.14, "AI"]
data.insert(1, "code") # List becomes: ["Python", "code", 2027, True, 3.14, "AI"]

# 5. SLICING: Extract a sub-list (index 1 up to, but excluding, 4)
subset = data[1:4]     # Extracts: ["code", 2027, True]

# 6. REMOVAL: Delete elements by value, index, or clear the list
data.remove(True)      # Removes first occurrence of True
popped_item = data.pop(2) # Removes and returns item at index 2 (2027)
del data[0]            # Deletes the item at index 0 ("Python")

# Final state of the list after operations
print(data)            # Output: ['code', 3.14, 'AI']
