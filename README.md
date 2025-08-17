# Jart - Java Geometric Art Generator

A Java library for programmatically creating images composed of various geometrical shapes. Generate beautiful artwork using points, lines, circles, rectangles, and triangles with automatic random coloring.

## 🎨 Features

- **Multiple Shape Types**: Points, Lines, Circles, Rectangles, Triangles
- **Automatic Random Colors**: Each shape gets a unique random color
- **High-Quality Rendering**: Uses Bresenham's line algorithm for crisp, pixel-perfect lines
- **Flexible API**: Object-oriented design with interfaces for extensibility
- **Image Export**: Save your creations as PNG files
- **Random Generators**: Built-in methods to create random shapes within specified bounds

## 📁 Project Structure

```
jart/
├── geometrical_shapes/
│   ├── Displayable.java      # Interface for drawable surfaces
│   ├── Drawable.java         # Interface for drawable shapes
│   ├── Image.java           # Canvas implementation
│   ├── Point.java           # Point shape
│   ├── Line.java            # Line shape using Bresenham's algorithm
│   ├── Circle.java          # Circle shape
│   ├── Rectangle.java       # Rectangle shape
│   └── Triangle.java        # Triangle shape
├── Main.java                # Example usage
├── README.md               # This file
└── .gitignore              # Git ignore rules
```

## 🚀 Quick Start

### Prerequisites
- Java 17 or higher
- Any Java IDE or command line tools

### Compilation & Running

```bash
# Compile the project
javac -d build Main.java

# Run the example
java -cp build Main

# View the generated image
# Opens image.png in your default image viewer
```
