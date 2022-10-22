CREATE VIEW info AS SELECT city, street, building, flat, phone_number, email
                    FROM contact
                        JOIN address
                            ON address.contact_id = contact.id;