INSERT INTO "user" (Email)
SELECT
        'user' || generate_series || '@example.com' AS Email
FROM
    GENERATE_SERIES(1, 20);


INSERT into product (ProductName,Price)
SELECT
        'Product' || generate_series AS ProductName,
        (RANDOM() * 100 + 1) AS Price
FROM
    GENERATE_SERIES(1, 20);

-- Assuming you have a Transaction table with the required columns

-- Insert 20 sample transactions with random data for the date range Jan-March 2023
INSERT INTO Transaction (UserID, ProductID, TransactionDate, Quantity, Subtotal)
SELECT
    U.UserID,
    P.ProductID,
    TIMESTAMP '2023-01-01' + (RANDOM() * (TIMESTAMP '2023-03-31' - TIMESTAMP '2023-01-01')) AS TransactionDate,
    CAST(RANDOM() * 10 + 1 AS INT) AS Quantity,
    (RANDOM() * 100 + 1) AS Subtotal
FROM
    (SELECT UserID FROM "user" ORDER BY RANDOM() LIMIT 20) U
        CROSS JOIN
    (SELECT ProductID FROM Product ORDER BY RANDOM() LIMIT 20) P;