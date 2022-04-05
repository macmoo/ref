delimiter //
CREATE PROCEDURE get_writer(IN input_lastname TEXT)
BEGIN
select lastname, firstname FROM writer WHERE lastname = input_lastname;
END
//