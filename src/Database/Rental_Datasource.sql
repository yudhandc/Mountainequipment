CREATE TABLE Equipments (
    EquipmentsId      CHAR(5) NOT NULL,
    EquipmentsName     VARCHAR(100) NOT NULL,
    Stock	    SMALLINT DEFAULT 0,
    EquipmentsPrice	    INTEGER DEFAULT 0,
    PRIMARY KEY(EquipmentsId)
) ENGINE = InnoDb;

CREATE TABLE Customers (
    CustomersId      CHAR(5) NOT NULL,
    CustomersName     VARCHAR(100) NOT NULL,
    CustomersAddress     VARCHAR(100) NOT NULL,
    PhoneNumber     VARCHAR(20) NOT NULL,
    BornPlace     VARCHAR(50) NOT NULL,
    BornDate     DATETIME NOT NULL,
    CustomersIdentitas     CHAR(20) NOT NULL,
    Gender     VARCHAR(20) NOT NULL,
    CustomersWork     VARCHAR(50) NOT NULL,
    PRIMARY KEY(CustomersId)
) ENGINE = InnoDb;

CREATE TABLE Transactionrental(
    TrasactionId CHAR(5) NOT NULL,
    DateTransaction DATETIME NOT NULL,
    Total NUMERIC DEFAULT 0,
    PRIMARY KEY(TrasactionId)
)

CREATE TABLE TransactionrentalDetail (
    DetailId         CHAR(5) NOT NULL,
    CustomersId         CHAR(5) NOT NULL,
    EquipmentsId         CHAR(5) NOT NULL,
    TrasactionId         CHAR(5) NOT NULL,
    Quantity        SMALLINT NOT NULL,
    Denda           INTEGER DEFAULT 0,
    Durasi         CHAR(5) NOT NULL,
    DateRent        DATETIME NOT NULL,
    DateBack        DATETIME NOT NULL,
    Price           NUMERIC NOT NULL,
    PRIMARY KEY(DetailId)
) ENGINE = InnoDb;

ALTER TABLE TransactionrentalDetail ADD CONSTRAINT fk_Equipments_TransactionrentalDetail
FOREIGN KEY(EquipmentsId) REFERENCES Equipments(EquipmentsId)
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE TransactionrentalDetail ADD CONSTRAINT fk_Customers_TransactionrentalDetail
FOREIGN KEY(CustomersId) REFERENCES Customers(CustomersId)
ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE TransactionrentalDetail ADD CONSTRAINT fk_Transactionrents_TransactionrentalDetail
FOREIGN KEY(DetailId) REFERENCES Transactionrental(DetailId)
ON DELETE CASCADE ON UPDATE CASCADE;
