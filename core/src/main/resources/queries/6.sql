WITH parent_with_null AS(
    SELECT person_data.id FROM person_data
        JOIN medical_card
            ON person_data.medical_card_id = medical_card.id
                          WHERE medical_card.med_status is null
)
SELECT * FROM person_data
         WHERE parent_id IN
               (SELECT id FROM parent_with_null)