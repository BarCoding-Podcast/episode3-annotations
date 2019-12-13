#JPA
With these examples you can see the power of annotations as metadata.

##JPA annotations
By adding the `@Entity` annotation, the class is indicated as an JPA entity and will be added to the xml config that's needed at runtime. Within the entity an field needs to be be annotated with `@Id` to indicate it as Id of the entity.<br/>
Examples can be found in the `annotations` package.

##No annotations
Without the use of annotations we need to create the XML files for JPA manually. First we start with creating an class of the entity we would like te persist. After that we need to create an `orm.xml` file to indicate which fields are present in the database.<br/>
Then the `persistence.xml` file needs to be created and needs to point to the `orm.xml` file. This will make sure JPA know which entity are present in your application.<br/>
An short example can be found in the `nonannotations` package.
