import matplotlib
print("Matplotlib version:", matplotlib.__version__)
print("Backend:", matplotlib.get_backend())

import matplotlib.pyplot as plt

plt.plot([1, 2, 3], [4, 5, 7], marker="o")
plt.title("Matplotlib Test")
plt.show(block=True)

print("Plot window closed.")