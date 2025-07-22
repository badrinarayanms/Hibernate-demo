# 🐘 Hibernate + PostgreSQL – Demo App

This is a basic demo project using **Hibernate ORM** with **PostgreSQL**, without Spring Boot.  
It shows how to perform CRUD operations using `SessionFactory` and `Session`.

---

## 📌 Features

- Manual Hibernate configuration using `hibernate.cfg.xml`
- Create a `Student` object
- Perform:
  - Insert (`persist`)
  - Update (`merge`)
  - Delete (`remove`)
  - Fetch (`get`)

---

## 💡 Technologies Used

- Hibernate Core (ORM)
- PostgreSQL
- Java

---

## ⚙️ Hibernate Configuration (`hibernate.cfg.xml`)

```xml
<hibernate-configuration xmlns="http://www.hibernate.org/xsd/orm/cfg">
    <session-factory>
        <property name="hibernate.connection.driver_class">org.postgresql.Driver</property>
        <property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/learn</property>
        <property name="hibernate.connection.username">postgres</property>
        <property name="hibernate.connection.password"></property>

        <property name="hibernate.hbm2ddl.auto">update</property>
    </session-factory>
</hibernate-configuration>
```
