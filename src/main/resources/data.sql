-- Insert sample doctors if they don't exist
INSERT INTO doctors (name, specialization, qualification, license_number) 
SELECT 'Dr. John Smith', 'Cardiology', 'MD, DM', 'MED001'
WHERE NOT EXISTS (SELECT 1 FROM doctors WHERE license_number = 'MED001');

INSERT INTO doctors (name, specialization, qualification, license_number)
SELECT 'Dr. Sarah Johnson', 'Pediatrics', 'MD', 'MED002'
WHERE NOT EXISTS (SELECT 1 FROM doctors WHERE license_number = 'MED002');

INSERT INTO doctors (name, specialization, qualification, license_number)
SELECT 'Dr. Michael Chen', 'Orthopedics', 'MS, DNB', 'MED003'
WHERE NOT EXISTS (SELECT 1 FROM doctors WHERE license_number = 'MED003');