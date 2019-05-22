//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.22 a las 07:10:04 PM BST 
//


package daw.exercise;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para result element declaration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;element name="result">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="vid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="log" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="promote" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="sticky" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="changed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="tnid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="translate" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="revision_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="revision_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="body">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="field_youtube">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="video_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="field_exercise_tips">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="field_involved_muscles" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="field_trainings">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="und">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="rdf_mapping">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="rdftype">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="title">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="created">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="changed">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="body">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="uid">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="name">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="comment_count">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="last_activity">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                               &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *           &lt;element name="cid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="last_comment_timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="last_comment_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="last_comment_uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="comment_count" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vid",
    "uid",
    "title",
    "log",
    "status",
    "comment",
    "promote",
    "sticky",
    "nid",
    "type",
    "language",
    "created",
    "changed",
    "tnid",
    "translate",
    "revisionTimestamp",
    "revisionUid",
    "body",
    "fieldYoutube",
    "fieldExerciseTips",
    "fieldInvolvedMuscles",
    "fieldTrainings",
    "rdfMapping",
    "path",
    "cid",
    "lastCommentTimestamp",
    "lastCommentName",
    "lastCommentUid",
    "commentCount",
    "name",
    "picture",
    "data"
})
@XmlRootElement(name = "result")
public class Exercise {

    protected byte vid;
    protected byte uid;
    @XmlElement(required = true)
    protected String title;
    @XmlElement(required = true)
    protected String log;
    protected byte status;
    protected byte comment;
    protected byte promote;
    protected byte sticky;
    protected byte nid;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String language;
    protected int created;
    protected int changed;
    protected byte tnid;
    protected byte translate;
    @XmlElement(name = "revision_timestamp")
    protected int revisionTimestamp;
    @XmlElement(name = "revision_uid")
    protected byte revisionUid;
    @XmlElement(required = true)
    protected Exercise.Body body;
    @XmlElement(name = "field_youtube", required = true)
    protected Exercise.FieldYoutube fieldYoutube;
    @XmlElement(name = "field_exercise_tips", required = true)
    protected Exercise.FieldExerciseTips fieldExerciseTips;
    @XmlElement(name = "field_involved_muscles", required = true)
    protected String fieldInvolvedMuscles;
    @XmlElement(name = "field_trainings", required = true)
    protected Exercise.FieldTrainings fieldTrainings;
    @XmlElement(name = "rdf_mapping", required = true)
    protected Exercise.RdfMapping rdfMapping;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String path;
    protected byte cid;
    @XmlElement(name = "last_comment_timestamp")
    protected int lastCommentTimestamp;
    @XmlElement(name = "last_comment_name", required = true)
    protected String lastCommentName;
    @XmlElement(name = "last_comment_uid")
    protected byte lastCommentUid;
    @XmlElement(name = "comment_count")
    protected byte commentCount;
    @XmlElement(required = true)
    protected String name;
    protected byte picture;
    @XmlElement(required = true)
    protected String data;

    /**
     * Obtiene el valor de la propiedad vid.
     * 
     */
    public byte getVid() {
        return vid;
    }

    /**
     * Define el valor de la propiedad vid.
     * 
     */
    public void setVid(byte value) {
        this.vid = value;
    }

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     */
    public byte getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     */
    public void setUid(byte value) {
        this.uid = value;
    }

    /**
     * Obtiene el valor de la propiedad title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define el valor de la propiedad title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLog(String value) {
        this.log = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad comment.
     * 
     */
    public byte getComment() {
        return comment;
    }

    /**
     * Define el valor de la propiedad comment.
     * 
     */
    public void setComment(byte value) {
        this.comment = value;
    }

    /**
     * Obtiene el valor de la propiedad promote.
     * 
     */
    public byte getPromote() {
        return promote;
    }

    /**
     * Define el valor de la propiedad promote.
     * 
     */
    public void setPromote(byte value) {
        this.promote = value;
    }

    /**
     * Obtiene el valor de la propiedad sticky.
     * 
     */
    public byte getSticky() {
        return sticky;
    }

    /**
     * Define el valor de la propiedad sticky.
     * 
     */
    public void setSticky(byte value) {
        this.sticky = value;
    }

    /**
     * Obtiene el valor de la propiedad nid.
     * 
     */
    public byte getNid() {
        return nid;
    }

    /**
     * Define el valor de la propiedad nid.
     * 
     */
    public void setNid(byte value) {
        this.nid = value;
    }

    /**
     * Obtiene el valor de la propiedad type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Define el valor de la propiedad type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     */
    public int getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     */
    public void setCreated(int value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad changed.
     * 
     */
    public int getChanged() {
        return changed;
    }

    /**
     * Define el valor de la propiedad changed.
     * 
     */
    public void setChanged(int value) {
        this.changed = value;
    }

    /**
     * Obtiene el valor de la propiedad tnid.
     * 
     */
    public byte getTnid() {
        return tnid;
    }

    /**
     * Define el valor de la propiedad tnid.
     * 
     */
    public void setTnid(byte value) {
        this.tnid = value;
    }

    /**
     * Obtiene el valor de la propiedad translate.
     * 
     */
    public byte getTranslate() {
        return translate;
    }

    /**
     * Define el valor de la propiedad translate.
     * 
     */
    public void setTranslate(byte value) {
        this.translate = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionTimestamp.
     * 
     */
    public int getRevisionTimestamp() {
        return revisionTimestamp;
    }

    /**
     * Define el valor de la propiedad revisionTimestamp.
     * 
     */
    public void setRevisionTimestamp(int value) {
        this.revisionTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad revisionUid.
     * 
     */
    public byte getRevisionUid() {
        return revisionUid;
    }

    /**
     * Define el valor de la propiedad revisionUid.
     * 
     */
    public void setRevisionUid(byte value) {
        this.revisionUid = value;
    }

    /**
     * Obtiene el valor de la propiedad body.
     * 
     * @return
     *     possible object is
     *     {@link Exercise.Body }
     *     
     */
    public Exercise.Body getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise.Body }
     *     
     */
    public void setBody(Exercise.Body value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldYoutube.
     * 
     * @return
     *     possible object is
     *     {@link Exercise.FieldYoutube }
     *     
     */
    public Exercise.FieldYoutube getFieldYoutube() {
        return fieldYoutube;
    }

    /**
     * Define el valor de la propiedad fieldYoutube.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise.FieldYoutube }
     *     
     */
    public void setFieldYoutube(Exercise.FieldYoutube value) {
        this.fieldYoutube = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldExerciseTips.
     * 
     * @return
     *     possible object is
     *     {@link Exercise.FieldExerciseTips }
     *     
     */
    public Exercise.FieldExerciseTips getFieldExerciseTips() {
        return fieldExerciseTips;
    }

    /**
     * Define el valor de la propiedad fieldExerciseTips.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise.FieldExerciseTips }
     *     
     */
    public void setFieldExerciseTips(Exercise.FieldExerciseTips value) {
        this.fieldExerciseTips = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldInvolvedMuscles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldInvolvedMuscles() {
        return fieldInvolvedMuscles;
    }

    /**
     * Define el valor de la propiedad fieldInvolvedMuscles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldInvolvedMuscles(String value) {
        this.fieldInvolvedMuscles = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldTrainings.
     * 
     * @return
     *     possible object is
     *     {@link Exercise.FieldTrainings }
     *     
     */
    public Exercise.FieldTrainings getFieldTrainings() {
        return fieldTrainings;
    }

    /**
     * Define el valor de la propiedad fieldTrainings.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise.FieldTrainings }
     *     
     */
    public void setFieldTrainings(Exercise.FieldTrainings value) {
        this.fieldTrainings = value;
    }

    /**
     * Obtiene el valor de la propiedad rdfMapping.
     * 
     * @return
     *     possible object is
     *     {@link Exercise.RdfMapping }
     *     
     */
    public Exercise.RdfMapping getRdfMapping() {
        return rdfMapping;
    }

    /**
     * Define el valor de la propiedad rdfMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link Exercise.RdfMapping }
     *     
     */
    public void setRdfMapping(Exercise.RdfMapping value) {
        this.rdfMapping = value;
    }

    /**
     * Obtiene el valor de la propiedad path.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Define el valor de la propiedad path.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

    /**
     * Obtiene el valor de la propiedad cid.
     * 
     */
    public byte getCid() {
        return cid;
    }

    /**
     * Define el valor de la propiedad cid.
     * 
     */
    public void setCid(byte value) {
        this.cid = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public int getLastCommentTimestamp() {
        return lastCommentTimestamp;
    }

    /**
     * Define el valor de la propiedad lastCommentTimestamp.
     * 
     */
    public void setLastCommentTimestamp(int value) {
        this.lastCommentTimestamp = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastCommentName() {
        return lastCommentName;
    }

    /**
     * Define el valor de la propiedad lastCommentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastCommentName(String value) {
        this.lastCommentName = value;
    }

    /**
     * Obtiene el valor de la propiedad lastCommentUid.
     * 
     */
    public byte getLastCommentUid() {
        return lastCommentUid;
    }

    /**
     * Define el valor de la propiedad lastCommentUid.
     * 
     */
    public void setLastCommentUid(byte value) {
        this.lastCommentUid = value;
    }

    /**
     * Obtiene el valor de la propiedad commentCount.
     * 
     */
    public byte getCommentCount() {
        return commentCount;
    }

    /**
     * Define el valor de la propiedad commentCount.
     * 
     */
    public void setCommentCount(byte value) {
        this.commentCount = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     * 
     */
    public byte getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     */
    public void setPicture(byte value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class Body {

        @XmlElement(required = true)
        protected Exercise.Body.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.Body.Und }
         *     
         */
        public Exercise.Body.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.Body.Und }
         *     
         */
        public void setUnd(Exercise.Body.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Exercise.Body.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.Body.Und.Item }
             *     
             */
            public Exercise.Body.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.Body.Und.Item }
             *     
             */
            public void setItem(Exercise.Body.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="safe_summary" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value",
                "summary",
                "format",
                "safeValue",
                "safeSummary"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String value;
                @XmlElement(required = true)
                protected String summary;
                @XmlElement(required = true)
                protected String format;
                @XmlElement(name = "safe_value", required = true)
                protected String safeValue;
                @XmlElement(name = "safe_summary", required = true)
                protected String safeSummary;

                /**
                 * Obtiene el valor de la propiedad value.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad summary.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSummary() {
                    return summary;
                }

                /**
                 * Define el valor de la propiedad summary.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSummary(String value) {
                    this.summary = value;
                }

                /**
                 * Obtiene el valor de la propiedad format.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFormat() {
                    return format;
                }

                /**
                 * Define el valor de la propiedad format.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFormat(String value) {
                    this.format = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeValue() {
                    return safeValue;
                }

                /**
                 * Define el valor de la propiedad safeValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeValue(String value) {
                    this.safeValue = value;
                }

                /**
                 * Obtiene el valor de la propiedad safeSummary.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSafeSummary() {
                    return safeSummary;
                }

                /**
                 * Define el valor de la propiedad safeSummary.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSafeSummary(String value) {
                    this.safeSummary = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldExerciseTips {

        @XmlElement(required = true)
        protected Exercise.FieldExerciseTips.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.FieldExerciseTips.Und }
         *     
         */
        public Exercise.FieldExerciseTips.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.FieldExerciseTips.Und }
         *     
         */
        public void setUnd(Exercise.FieldExerciseTips.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Exercise.FieldExerciseTips.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.FieldExerciseTips.Und.Item }
             *     
             */
            public Exercise.FieldExerciseTips.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.FieldExerciseTips.Und.Item }
             *     
             */
            public void setItem(Exercise.FieldExerciseTips.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "targetId"
            })
            public static class Item {

                @XmlElement(name = "target_id")
                protected byte targetId;

                /**
                 * Obtiene el valor de la propiedad targetId.
                 * 
                 */
                public byte getTargetId() {
                    return targetId;
                }

                /**
                 * Define el valor de la propiedad targetId.
                 * 
                 */
                public void setTargetId(byte value) {
                    this.targetId = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldTrainings {

        @XmlElement(required = true)
        protected Exercise.FieldTrainings.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.FieldTrainings.Und }
         *     
         */
        public Exercise.FieldTrainings.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.FieldTrainings.Und }
         *     
         */
        public void setUnd(Exercise.FieldTrainings.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            protected List<Exercise.FieldTrainings.Und.Item> item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Exercise.FieldTrainings.Und.Item }
             * 
             * 
             */
            public List<Exercise.FieldTrainings.Und.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Exercise.FieldTrainings.Und.Item>();
                }
                return this.item;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="target_id" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "targetId"
            })
            public static class Item {

                @XmlElement(name = "target_id")
                protected byte targetId;

                /**
                 * Obtiene el valor de la propiedad targetId.
                 * 
                 */
                public byte getTargetId() {
                    return targetId;
                }

                /**
                 * Define el valor de la propiedad targetId.
                 * 
                 */
                public void setTargetId(byte value) {
                    this.targetId = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="und">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="video_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "und"
    })
    public static class FieldYoutube {

        @XmlElement(required = true)
        protected Exercise.FieldYoutube.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.FieldYoutube.Und }
         *     
         */
        public Exercise.FieldYoutube.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.FieldYoutube.Und }
         *     
         */
        public void setUnd(Exercise.FieldYoutube.Und value) {
            this.und = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="video_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Und {

            @XmlElement(required = true)
            protected Exercise.FieldYoutube.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.FieldYoutube.Und.Item }
             *     
             */
            public Exercise.FieldYoutube.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.FieldYoutube.Und.Item }
             *     
             */
            public void setItem(Exercise.FieldYoutube.Und.Item value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="input" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="video_id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "input",
                "videoId"
            })
            public static class Item {

                @XmlElement(required = true)
                protected String input;
                @XmlElement(name = "video_id", required = true)
                protected String videoId;

                /**
                 * Obtiene el valor de la propiedad input.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInput() {
                    return input;
                }

                /**
                 * Define el valor de la propiedad input.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInput(String value) {
                    this.input = value;
                }

                /**
                 * Obtiene el valor de la propiedad videoId.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVideoId() {
                    return videoId;
                }

                /**
                 * Define el valor de la propiedad videoId.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVideoId(String value) {
                    this.videoId = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="rdftype">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="title">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="created">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="changed">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="body">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="uid">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="comment_count">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="last_activity">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "rdftype",
        "title",
        "created",
        "changed",
        "body",
        "uid",
        "name",
        "commentCount",
        "lastActivity"
    })
    public static class RdfMapping {

        @XmlElement(required = true)
        protected Exercise.RdfMapping.Rdftype rdftype;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Title title;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Created created;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Changed changed;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Body body;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Uid uid;
        @XmlElement(required = true)
        protected Exercise.RdfMapping.Name name;
        @XmlElement(name = "comment_count", required = true)
        protected Exercise.RdfMapping.CommentCount commentCount;
        @XmlElement(name = "last_activity", required = true)
        protected Exercise.RdfMapping.LastActivity lastActivity;

        /**
         * Obtiene el valor de la propiedad rdftype.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Rdftype }
         *     
         */
        public Exercise.RdfMapping.Rdftype getRdftype() {
            return rdftype;
        }

        /**
         * Define el valor de la propiedad rdftype.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Rdftype }
         *     
         */
        public void setRdftype(Exercise.RdfMapping.Rdftype value) {
            this.rdftype = value;
        }

        /**
         * Obtiene el valor de la propiedad title.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Title }
         *     
         */
        public Exercise.RdfMapping.Title getTitle() {
            return title;
        }

        /**
         * Define el valor de la propiedad title.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Title }
         *     
         */
        public void setTitle(Exercise.RdfMapping.Title value) {
            this.title = value;
        }

        /**
         * Obtiene el valor de la propiedad created.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Created }
         *     
         */
        public Exercise.RdfMapping.Created getCreated() {
            return created;
        }

        /**
         * Define el valor de la propiedad created.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Created }
         *     
         */
        public void setCreated(Exercise.RdfMapping.Created value) {
            this.created = value;
        }

        /**
         * Obtiene el valor de la propiedad changed.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Changed }
         *     
         */
        public Exercise.RdfMapping.Changed getChanged() {
            return changed;
        }

        /**
         * Define el valor de la propiedad changed.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Changed }
         *     
         */
        public void setChanged(Exercise.RdfMapping.Changed value) {
            this.changed = value;
        }

        /**
         * Obtiene el valor de la propiedad body.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Body }
         *     
         */
        public Exercise.RdfMapping.Body getBody() {
            return body;
        }

        /**
         * Define el valor de la propiedad body.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Body }
         *     
         */
        public void setBody(Exercise.RdfMapping.Body value) {
            this.body = value;
        }

        /**
         * Obtiene el valor de la propiedad uid.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Uid }
         *     
         */
        public Exercise.RdfMapping.Uid getUid() {
            return uid;
        }

        /**
         * Define el valor de la propiedad uid.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Uid }
         *     
         */
        public void setUid(Exercise.RdfMapping.Uid value) {
            this.uid = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.Name }
         *     
         */
        public Exercise.RdfMapping.Name getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.Name }
         *     
         */
        public void setName(Exercise.RdfMapping.Name value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad commentCount.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.CommentCount }
         *     
         */
        public Exercise.RdfMapping.CommentCount getCommentCount() {
            return commentCount;
        }

        /**
         * Define el valor de la propiedad commentCount.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.CommentCount }
         *     
         */
        public void setCommentCount(Exercise.RdfMapping.CommentCount value) {
            this.commentCount = value;
        }

        /**
         * Obtiene el valor de la propiedad lastActivity.
         * 
         * @return
         *     possible object is
         *     {@link Exercise.RdfMapping.LastActivity }
         *     
         */
        public Exercise.RdfMapping.LastActivity getLastActivity() {
            return lastActivity;
        }

        /**
         * Define el valor de la propiedad lastActivity.
         * 
         * @param value
         *     allowed object is
         *     {@link Exercise.RdfMapping.LastActivity }
         *     
         */
        public void setLastActivity(Exercise.RdfMapping.LastActivity value) {
            this.lastActivity = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates"
        })
        public static class Body {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Body.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Body.Predicates }
             *     
             */
            public Exercise.RdfMapping.Body.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Body.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Body.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates",
            "datatype",
            "callback"
        })
        public static class Changed {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Changed.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Changed.Predicates }
             *     
             */
            public Exercise.RdfMapping.Changed.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Changed.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Changed.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates",
            "datatype"
        })
        public static class CommentCount {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.CommentCount.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.CommentCount.Predicates }
             *     
             */
            public Exercise.RdfMapping.CommentCount.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.CommentCount.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.CommentCount.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates",
            "datatype",
            "callback"
        })
        public static class Created {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Created.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Created.Predicates }
             *     
             */
            public Exercise.RdfMapping.Created.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Created.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Created.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                protected List<String> item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Gets the value of the item property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the item property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getItem().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getItem() {
                    if (item == null) {
                        item = new ArrayList<String>();
                    }
                    return this.item;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="datatype" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="callback" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates",
            "datatype",
            "callback"
        })
        public static class LastActivity {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.LastActivity.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.LastActivity.Predicates }
             *     
             */
            public Exercise.RdfMapping.LastActivity.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.LastActivity.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.LastActivity.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad datatype.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDatatype() {
                return datatype;
            }

            /**
             * Define el valor de la propiedad datatype.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDatatype(String value) {
                this.datatype = value;
            }

            /**
             * Obtiene el valor de la propiedad callback.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCallback() {
                return callback;
            }

            /**
             * Define el valor de la propiedad callback.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCallback(String value) {
                this.callback = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates"
        })
        public static class Name {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Name.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Name.Predicates }
             *     
             */
            public Exercise.RdfMapping.Name.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Name.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Name.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Rdftype {

            protected List<String> item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Gets the value of the item property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the item property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItem().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getItem() {
                if (item == null) {
                    item = new ArrayList<String>();
                }
                return this.item;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates"
        })
        public static class Title {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Title.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Title.Predicates }
             *     
             */
            public Exercise.RdfMapping.Title.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Title.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Title.Predicates value) {
                this.predicates = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "predicates",
            "type"
        })
        public static class Uid {

            @XmlElement(required = true)
            protected Exercise.RdfMapping.Uid.Predicates predicates;
            @XmlElement(required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Exercise.RdfMapping.Uid.Predicates }
             *     
             */
            public Exercise.RdfMapping.Uid.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Exercise.RdfMapping.Uid.Predicates }
             *     
             */
            public void setPredicates(Exercise.RdfMapping.Uid.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
                }

            }

        }

    }

}
