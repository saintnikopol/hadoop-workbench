ALTER TABLE USER
  DROP FOREIGN KEY USER_KEY_FK,
  DROP INDEX USER_KEY_FK;

ALTER TABLE USER
  ADD CONSTRAINT USER_KEY_FK FOREIGN KEY (KEY_ID) REFERENCES KEY_FILE (ID) ON DELETE SET NULL;

ALTER TABLE API 
    DROP FOREIGN KEY API_KEY_FK,
    DROP INDEX API_KEY_FK;

ALTER TABLE API
  ADD CONSTRAINT API_KEY_FK FOREIGN KEY (KEY_ID) REFERENCES KEY_FILE (ID) ON DELETE SET NULL;





