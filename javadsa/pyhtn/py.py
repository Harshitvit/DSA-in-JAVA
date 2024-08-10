import math

def calculate_circle_metrics(radius):
    
    circumference = 2 * math.pi * radius
    area = math.pi * radius ** 2
    return circumference, area

# Example usage
radius = 5
circumference, area = calculate_circle_metrics(radius)
print(f"Circumference: {circumference}")
print(f"Area: {area}")
