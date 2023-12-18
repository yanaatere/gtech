-- Create User table
CREATE TABLE "user" (
                        UserID SERIAL PRIMARY KEY,
                        Email VARCHAR(255) NOT NULL
);

-- Create Product table
CREATE TABLE product (
                         ProductID SERIAL PRIMARY KEY,
                         ProductName VARCHAR(255) NOT NULL,
                         Price DECIMAL(10, 2) NOT NULL
);

-- Create Transaction table
CREATE TABLE "transaction" (
                               TransactionID SERIAL PRIMARY KEY,
                               UserID INT,
                               ProductID INT,
                               TransactionDate DATE NOT NULL,
                               Quantity INT NOT NULL,
                               Subtotal DECIMAL(10, 2) NOT NULL,

    -- Foreign key constraints
                               FOREIGN KEY (UserID) REFERENCES "user"(UserID),
                               FOREIGN KEY (ProductID) REFERENCES product(ProductID)
);