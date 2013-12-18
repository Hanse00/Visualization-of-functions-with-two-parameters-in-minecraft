import numpy as np
import matplotlib.pyplot as plt

x = np.linspace(-1*np.pi,1*np.pi,500)
y = np.cos(np.square(x))

plt.plot(x,y)

plt.show()
