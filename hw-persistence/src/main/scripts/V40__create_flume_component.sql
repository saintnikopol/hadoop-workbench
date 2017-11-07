CREATE TABLE FLUME_COMPONENT (
  PLATFORM_ID INT NOT NULL,
  CLUSTER_ID VARCHAR(256) NOT NULL,
  SERVICE_ID VARCHAR(256) NOT NULL,
  COMPONENT_ID VARCHAR(256) NOT NULL,
  COMPONENT_NAME VARCHAR(256) NOT NULL,
  AGENT_NAME NVARCHAR(256) NOT NULL,
  LAST_UPDATE LONG NOT NULL,
  PRIMARY KEY (PLATFORM_ID, CLUSTER_ID, SERVICE_ID, COMPONENT_ID),
  CONSTRAINT FLUME_COMPONENT_SERVICE_FK FOREIGN KEY (PLATFORM_ID, CLUSTER_ID, SERVICE_ID)
    REFERENCES CLUSTER_SERVICE (PLATFORM_ID, CLUSTER_ID, SERVICE_ID) ON DELETE CASCADE
)