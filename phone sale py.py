# Phone Sale System

phones = {
    1: {"brand": "iPhone", "model": "14 Pro", "price": 999},
    2: {"brand": "Samsung", "model": "Galaxy S23", "price": 899},
    3: {"brand": "Xiaomi", "model": "Redmi Note 13", "price": 299},
    4: {"brand": "OnePlus", "model": "11", "price": 749}
}

def display_phones():
    print("Available Phones:")
    for key, phone in phones.items():
        print(f"{key}. {phone['brand']} {phone['model']} - ${phone['price']}")

def take_order():
    display_phones()
    choice = int(input("Enter the number of the phone you want to buy: "))
    if choice in phones:
        quantity = int(input("Enter quantity: "))
        selected = phones[choice]
        total = selected["price"] * quantity
        print("\n--- Receipt ---")
        print(f"Phone: {selected['brand']} {selected['model']}")
        print(f"Unit Price: ${selected['price']}")
        print(f"Quantity: {quantity}")
        print(f"Total Price: ${total}")
    else:
        print("Invalid selection. Please try again.")

# Main program
take_order()