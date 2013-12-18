import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-1*np.pi,1*np.pi,500)
y = np.cos(np.square(x))

plt.figure()
plt.plot(x,y, "r")
plt.xlabel("x")
plt.ylabel("y")
plt.title("y = cos(square(x))")
plt.show()
