import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-1*np.pi,1*np.pi,500)

fig, axes = plt.subplots()
axes.plot(x,np.cos(np.square(x)), "r")
axes.plot(x,np.sin(np.square(x)), "b")
axes.set_xlabel("x")
axes.set_ylabel("y")
axes.set_title("y = cos(square(x))")
plt.show()
