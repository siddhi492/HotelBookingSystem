CREATE DATABASE hotel_booking;
use hotel_booking;
CREATE TABLE hotels (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    location VARCHAR(255),
    description TEXT
);
CREATE TABLE rooms (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    room_type VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    available BOOLEAN DEFAULT TRUE,
    hotel_id BIGINT,
    FOREIGN KEY (hotel_id) REFERENCES hotels(id)
);
CREATE TABLE bookings (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_name VARCHAR(255) NOT NULL,
    check_in_date DATE NOT NULL,
    check_out_date DATE NOT NULL,
    room_id BIGINT,
    FOREIGN KEY (room_id) REFERENCES rooms(id)
);
INSERT INTO hotels (name, location, description)
VALUES
    ('Hotel Paradise', 'New York', 'A luxury hotel in the heart of New York'),
    ('Beach Resort', 'California', 'A beautiful beach resort with ocean views');

INSERT INTO rooms (room_type, price, available, hotel_id)
VALUES
    ('Single', 150.00, TRUE, 1),
    ('Double', 250.00, TRUE, 1),
    ('Suite', 500.00, TRUE, 2),
    ('Family', 350.00, TRUE, 2);
    
INSERT INTO bookings (customer_name, check_in_date, check_out_date, room_id)
VALUES
    ('John Doe', '2025-02-01', '2025-02-07', 1),
    ('Jane Smith', '2025-03-15', '2025-03-20', 3);


select * from hotels;
