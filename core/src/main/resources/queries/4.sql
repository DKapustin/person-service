WITH distinct_rows AS
         (SELECT MIN(id) AS id, phone_number, email, profile_link
          FROM contact GROUP BY phone_number, email, profile_link)

DELETE FROM contact WHERE id NOT IN (SELECT id FROM distinct_rows);