//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.20 a las 06:12:06 PM BST 
//


package daw.training;

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
 *           &lt;element name="field_image">
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
 *                                         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                                         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                         &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                                         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
 *           &lt;element name="field_exercises">
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
 *           &lt;element name="field_training_types">
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
    "fieldImage",
    "fieldYoutube",
    "fieldExercises",
    "fieldTrainingTypes",
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
public class Training {

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
    protected Training.Body body;
    @XmlElement(name = "field_image", required = true)
    protected Training.FieldImage fieldImage;
    @XmlElement(name = "field_youtube", required = true)
    protected Training.FieldYoutube fieldYoutube;
    @XmlElement(name = "field_exercises", required = true)
    protected Training.FieldExercises fieldExercises;
    @XmlElement(name = "field_training_types", required = true)
    protected Training.FieldTrainingTypes fieldTrainingTypes;
    @XmlElement(name = "rdf_mapping", required = true)
    protected Training.RdfMapping rdfMapping;
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
     *     {@link Training.Body }
     *     
     */
    public Training.Body getBody() {
        return body;
    }

    /**
     * Define el valor de la propiedad body.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.Body }
     *     
     */
    public void setBody(Training.Body value) {
        this.body = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldImage.
     * 
     * @return
     *     possible object is
     *     {@link Training.FieldImage }
     *     
     */
    public Training.FieldImage getFieldImage() {
        return fieldImage;
    }

    /**
     * Define el valor de la propiedad fieldImage.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.FieldImage }
     *     
     */
    public void setFieldImage(Training.FieldImage value) {
        this.fieldImage = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldYoutube.
     * 
     * @return
     *     possible object is
     *     {@link Training.FieldYoutube }
     *     
     */
    public Training.FieldYoutube getFieldYoutube() {
        return fieldYoutube;
    }

    /**
     * Define el valor de la propiedad fieldYoutube.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.FieldYoutube }
     *     
     */
    public void setFieldYoutube(Training.FieldYoutube value) {
        this.fieldYoutube = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldExercises.
     * 
     * @return
     *     possible object is
     *     {@link Training.FieldExercises }
     *     
     */
    public Training.FieldExercises getFieldExercises() {
        return fieldExercises;
    }

    /**
     * Define el valor de la propiedad fieldExercises.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.FieldExercises }
     *     
     */
    public void setFieldExercises(Training.FieldExercises value) {
        this.fieldExercises = value;
    }

    /**
     * Obtiene el valor de la propiedad fieldTrainingTypes.
     * 
     * @return
     *     possible object is
     *     {@link Training.FieldTrainingTypes }
     *     
     */
    public Training.FieldTrainingTypes getFieldTrainingTypes() {
        return fieldTrainingTypes;
    }

    /**
     * Define el valor de la propiedad fieldTrainingTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.FieldTrainingTypes }
     *     
     */
    public void setFieldTrainingTypes(Training.FieldTrainingTypes value) {
        this.fieldTrainingTypes = value;
    }

    /**
     * Obtiene el valor de la propiedad rdfMapping.
     * 
     * @return
     *     possible object is
     *     {@link Training.RdfMapping }
     *     
     */
    public Training.RdfMapping getRdfMapping() {
        return rdfMapping;
    }

    /**
     * Define el valor de la propiedad rdfMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link Training.RdfMapping }
     *     
     */
    public void setRdfMapping(Training.RdfMapping value) {
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
        protected Training.Body.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Training.Body.Und }
         *     
         */
        public Training.Body.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.Body.Und }
         *     
         */
        public void setUnd(Training.Body.Und value) {
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
            protected Training.Body.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Training.Body.Und.Item }
             *     
             */
            public Training.Body.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.Body.Und.Item }
             *     
             */
            public void setItem(Training.Body.Und.Item value) {
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
    public static class FieldExercises {

        @XmlElement(required = true)
        protected Training.FieldExercises.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Training.FieldExercises.Und }
         *     
         */
        public Training.FieldExercises.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.FieldExercises.Und }
         *     
         */
        public void setUnd(Training.FieldExercises.Und value) {
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

            protected List<Training.FieldExercises.Und.Item> item;
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
             * {@link Training.FieldExercises.Und.Item }
             * 
             * 
             */
            public List<Training.FieldExercises.Und.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Training.FieldExercises.Und.Item>();
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
     *                             &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                             &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                             &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *                             &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    public static class FieldImage {

        @XmlElement(required = true)
        protected Training.FieldImage.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Training.FieldImage.Und }
         *     
         */
        public Training.FieldImage.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.FieldImage.Und }
         *     
         */
        public void setUnd(Training.FieldImage.Und value) {
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
         *                   &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *                   &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                   &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
         *                   &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
            protected Training.FieldImage.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Training.FieldImage.Und.Item }
             *     
             */
            public Training.FieldImage.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.FieldImage.Und.Item }
             *     
             */
            public void setItem(Training.FieldImage.Und.Item value) {
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
             *         &lt;element name="fid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="uri" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="filemime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
             *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *         &lt;element name="rdf_mapping" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="alt" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="width" type="{http://www.w3.org/2001/XMLSchema}short"/>
             *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
                "fid",
                "uid",
                "filename",
                "uri",
                "filemime",
                "filesize",
                "status",
                "timestamp",
                "rdfMapping",
                "alt",
                "title",
                "width",
                "height"
            })
            public static class Item {

                protected byte fid;
                protected byte uid;
                @XmlElement(required = true)
                protected String filename;
                @XmlElement(required = true)
                protected String uri;
                @XmlElement(required = true)
                protected String filemime;
                protected int filesize;
                protected byte status;
                protected int timestamp;
                @XmlElement(name = "rdf_mapping", required = true)
                protected String rdfMapping;
                @XmlElement(required = true)
                protected String alt;
                @XmlElement(required = true)
                protected String title;
                protected short width;
                protected short height;

                /**
                 * Obtiene el valor de la propiedad fid.
                 * 
                 */
                public byte getFid() {
                    return fid;
                }

                /**
                 * Define el valor de la propiedad fid.
                 * 
                 */
                public void setFid(byte value) {
                    this.fid = value;
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
                 * Obtiene el valor de la propiedad filename.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFilename() {
                    return filename;
                }

                /**
                 * Define el valor de la propiedad filename.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFilename(String value) {
                    this.filename = value;
                }

                /**
                 * Obtiene el valor de la propiedad uri.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getUri() {
                    return uri;
                }

                /**
                 * Define el valor de la propiedad uri.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setUri(String value) {
                    this.uri = value;
                }

                /**
                 * Obtiene el valor de la propiedad filemime.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFilemime() {
                    return filemime;
                }

                /**
                 * Define el valor de la propiedad filemime.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFilemime(String value) {
                    this.filemime = value;
                }

                /**
                 * Obtiene el valor de la propiedad filesize.
                 * 
                 */
                public int getFilesize() {
                    return filesize;
                }

                /**
                 * Define el valor de la propiedad filesize.
                 * 
                 */
                public void setFilesize(int value) {
                    this.filesize = value;
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
                 * Obtiene el valor de la propiedad timestamp.
                 * 
                 */
                public int getTimestamp() {
                    return timestamp;
                }

                /**
                 * Define el valor de la propiedad timestamp.
                 * 
                 */
                public void setTimestamp(int value) {
                    this.timestamp = value;
                }

                /**
                 * Obtiene el valor de la propiedad rdfMapping.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRdfMapping() {
                    return rdfMapping;
                }

                /**
                 * Define el valor de la propiedad rdfMapping.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRdfMapping(String value) {
                    this.rdfMapping = value;
                }

                /**
                 * Obtiene el valor de la propiedad alt.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAlt() {
                    return alt;
                }

                /**
                 * Define el valor de la propiedad alt.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAlt(String value) {
                    this.alt = value;
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
                 * Obtiene el valor de la propiedad width.
                 * 
                 */
                public short getWidth() {
                    return width;
                }

                /**
                 * Define el valor de la propiedad width.
                 * 
                 */
                public void setWidth(short value) {
                    this.width = value;
                }

                /**
                 * Obtiene el valor de la propiedad height.
                 * 
                 */
                public short getHeight() {
                    return height;
                }

                /**
                 * Define el valor de la propiedad height.
                 * 
                 */
                public void setHeight(short value) {
                    this.height = value;
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
    public static class FieldTrainingTypes {

        @XmlElement(required = true)
        protected Training.FieldTrainingTypes.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Training.FieldTrainingTypes.Und }
         *     
         */
        public Training.FieldTrainingTypes.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.FieldTrainingTypes.Und }
         *     
         */
        public void setUnd(Training.FieldTrainingTypes.Und value) {
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

            protected List<Training.FieldTrainingTypes.Und.Item> item;
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
             * {@link Training.FieldTrainingTypes.Und.Item }
             * 
             * 
             */
            public List<Training.FieldTrainingTypes.Und.Item> getItem() {
                if (item == null) {
                    item = new ArrayList<Training.FieldTrainingTypes.Und.Item>();
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
        protected Training.FieldYoutube.Und und;

        /**
         * Obtiene el valor de la propiedad und.
         * 
         * @return
         *     possible object is
         *     {@link Training.FieldYoutube.Und }
         *     
         */
        public Training.FieldYoutube.Und getUnd() {
            return und;
        }

        /**
         * Define el valor de la propiedad und.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.FieldYoutube.Und }
         *     
         */
        public void setUnd(Training.FieldYoutube.Und value) {
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
            protected Training.FieldYoutube.Und.Item item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link Training.FieldYoutube.Und.Item }
             *     
             */
            public Training.FieldYoutube.Und.Item getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.FieldYoutube.Und.Item }
             *     
             */
            public void setItem(Training.FieldYoutube.Und.Item value) {
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
        protected Training.RdfMapping.Rdftype rdftype;
        @XmlElement(required = true)
        protected Training.RdfMapping.Title title;
        @XmlElement(required = true)
        protected Training.RdfMapping.Created created;
        @XmlElement(required = true)
        protected Training.RdfMapping.Changed changed;
        @XmlElement(required = true)
        protected Training.RdfMapping.Body body;
        @XmlElement(required = true)
        protected Training.RdfMapping.Uid uid;
        @XmlElement(required = true)
        protected Training.RdfMapping.Name name;
        @XmlElement(name = "comment_count", required = true)
        protected Training.RdfMapping.CommentCount commentCount;
        @XmlElement(name = "last_activity", required = true)
        protected Training.RdfMapping.LastActivity lastActivity;

        /**
         * Obtiene el valor de la propiedad rdftype.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Rdftype }
         *     
         */
        public Training.RdfMapping.Rdftype getRdftype() {
            return rdftype;
        }

        /**
         * Define el valor de la propiedad rdftype.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Rdftype }
         *     
         */
        public void setRdftype(Training.RdfMapping.Rdftype value) {
            this.rdftype = value;
        }

        /**
         * Obtiene el valor de la propiedad title.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Title }
         *     
         */
        public Training.RdfMapping.Title getTitle() {
            return title;
        }

        /**
         * Define el valor de la propiedad title.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Title }
         *     
         */
        public void setTitle(Training.RdfMapping.Title value) {
            this.title = value;
        }

        /**
         * Obtiene el valor de la propiedad created.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Created }
         *     
         */
        public Training.RdfMapping.Created getCreated() {
            return created;
        }

        /**
         * Define el valor de la propiedad created.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Created }
         *     
         */
        public void setCreated(Training.RdfMapping.Created value) {
            this.created = value;
        }

        /**
         * Obtiene el valor de la propiedad changed.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Changed }
         *     
         */
        public Training.RdfMapping.Changed getChanged() {
            return changed;
        }

        /**
         * Define el valor de la propiedad changed.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Changed }
         *     
         */
        public void setChanged(Training.RdfMapping.Changed value) {
            this.changed = value;
        }

        /**
         * Obtiene el valor de la propiedad body.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Body }
         *     
         */
        public Training.RdfMapping.Body getBody() {
            return body;
        }

        /**
         * Define el valor de la propiedad body.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Body }
         *     
         */
        public void setBody(Training.RdfMapping.Body value) {
            this.body = value;
        }

        /**
         * Obtiene el valor de la propiedad uid.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Uid }
         *     
         */
        public Training.RdfMapping.Uid getUid() {
            return uid;
        }

        /**
         * Define el valor de la propiedad uid.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Uid }
         *     
         */
        public void setUid(Training.RdfMapping.Uid value) {
            this.uid = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.Name }
         *     
         */
        public Training.RdfMapping.Name getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.Name }
         *     
         */
        public void setName(Training.RdfMapping.Name value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad commentCount.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.CommentCount }
         *     
         */
        public Training.RdfMapping.CommentCount getCommentCount() {
            return commentCount;
        }

        /**
         * Define el valor de la propiedad commentCount.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.CommentCount }
         *     
         */
        public void setCommentCount(Training.RdfMapping.CommentCount value) {
            this.commentCount = value;
        }

        /**
         * Obtiene el valor de la propiedad lastActivity.
         * 
         * @return
         *     possible object is
         *     {@link Training.RdfMapping.LastActivity }
         *     
         */
        public Training.RdfMapping.LastActivity getLastActivity() {
            return lastActivity;
        }

        /**
         * Define el valor de la propiedad lastActivity.
         * 
         * @param value
         *     allowed object is
         *     {@link Training.RdfMapping.LastActivity }
         *     
         */
        public void setLastActivity(Training.RdfMapping.LastActivity value) {
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
            protected Training.RdfMapping.Body.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Body.Predicates }
             *     
             */
            public Training.RdfMapping.Body.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Body.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Body.Predicates value) {
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
            protected Training.RdfMapping.Changed.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Changed.Predicates }
             *     
             */
            public Training.RdfMapping.Changed.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Changed.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Changed.Predicates value) {
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
            protected Training.RdfMapping.CommentCount.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.CommentCount.Predicates }
             *     
             */
            public Training.RdfMapping.CommentCount.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.CommentCount.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.CommentCount.Predicates value) {
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
            protected Training.RdfMapping.Created.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Created.Predicates }
             *     
             */
            public Training.RdfMapping.Created.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Created.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Created.Predicates value) {
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
            protected Training.RdfMapping.LastActivity.Predicates predicates;
            @XmlElement(required = true)
            protected String datatype;
            @XmlElement(required = true)
            protected String callback;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.LastActivity.Predicates }
             *     
             */
            public Training.RdfMapping.LastActivity.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.LastActivity.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.LastActivity.Predicates value) {
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
            protected Training.RdfMapping.Name.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Name.Predicates }
             *     
             */
            public Training.RdfMapping.Name.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Name.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Name.Predicates value) {
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
            protected Training.RdfMapping.Title.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Title.Predicates }
             *     
             */
            public Training.RdfMapping.Title.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Title.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Title.Predicates value) {
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
            protected Training.RdfMapping.Uid.Predicates predicates;
            @XmlElement(required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Training.RdfMapping.Uid.Predicates }
             *     
             */
            public Training.RdfMapping.Uid.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Training.RdfMapping.Uid.Predicates }
             *     
             */
            public void setPredicates(Training.RdfMapping.Uid.Predicates value) {
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
