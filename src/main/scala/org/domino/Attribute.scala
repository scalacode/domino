package org.domino

sealed trait Attribute

sealed trait AnchorAttribute extends Attribute
sealed trait AreaAttribute extends Attribute
sealed trait AudioAttribute extends Attribute
sealed trait BaseAttribute extends Attribute
sealed trait BlockQuoteAttribute extends Attribute
sealed trait ButtonAttribute extends Attribute
sealed trait CanvasAttribute extends Attribute
sealed trait CaptionAttribute extends Attribute
sealed trait ColAttribute extends Attribute
sealed trait ColGroupAttribute extends Attribute
sealed trait CommandAttribute extends Attribute
sealed trait DelAttribute extends Attribute
sealed trait DetailsAttribute extends Attribute
sealed trait EmbedAttribute extends Attribute
sealed trait FieldSetAttribute extends Attribute
sealed trait FormAttribute extends Attribute
sealed trait HRAttribute extends Attribute
sealed trait HTMLAttribute extends Attribute
sealed trait IFrameAttribute extends Attribute
sealed trait ImageAttribute extends Attribute
sealed trait InputAttribute extends Attribute
sealed trait InsAttribute extends Attribute
sealed trait LabelAttribute extends Attribute
sealed trait LinkAttribute extends Attribute
sealed trait LIAttribute extends Attribute
sealed trait MapAttribute extends Attribute
sealed trait MetaAttribute extends Attribute
sealed trait MeterAttribute extends Attribute
sealed trait ObjectAttribute extends Attribute
sealed trait OLAttribute extends Attribute
sealed trait OptGroupAttribute extends Attribute
sealed trait OptionAttribute extends Attribute
sealed trait OutputAttribute extends Attribute
sealed trait ParamAttribute extends Attribute
sealed trait ProgressAttribute extends Attribute
sealed trait QAttribute extends Attribute
sealed trait ScriptAttribute extends Attribute
sealed trait SelectAttribute extends Attribute
sealed trait SourceAttribute extends Attribute
sealed trait StyleAttribute extends Attribute
sealed trait TableAttribute extends Attribute
sealed trait TBodyAttribute extends Attribute
sealed trait TDAttribute extends Attribute
sealed trait TextAreaAttribute extends Attribute
sealed trait TFootAttribute extends Attribute
sealed trait THAttribute extends Attribute
sealed trait THeadAttribute extends Attribute
sealed trait TimeAttribute extends Attribute
sealed trait TRAttribute extends Attribute
sealed trait TrackAttribute extends Attribute
sealed trait VideoAttribute extends Attribute

/**
 * The bottom type, a subtype of any potential type of attribute. This means that
 * attributes that are defined as instances of this trait are applicable to any
 * kind of element.
 */
sealed trait GlobalAttribute extends Attribute
  with AnchorAttribute
  with AreaAttribute
  with AudioAttribute
  with BlockQuoteAttribute
  with ButtonAttribute
  with CanvasAttribute
  with CaptionAttribute
  with ColAttribute
  with ColGroupAttribute
  with CommandAttribute
  with DelAttribute
  with DetailsAttribute
  with EmbedAttribute
  with FieldSetAttribute
  with FormAttribute
  with HRAttribute
  with HTMLAttribute
  with IFrameAttribute
  with ImageAttribute
  with InputAttribute
  with InsAttribute
  with LabelAttribute
  with LinkAttribute
  with LIAttribute
  with MapAttribute
  with MetaAttribute
  with MeterAttribute
  with ObjectAttribute
  with OLAttribute
  with OptGroupAttribute
  with OptionAttribute
  with OutputAttribute
  with ParamAttribute
  with ProgressAttribute
  with QAttribute
  with ScriptAttribute
  with SelectAttribute
  with SourceAttribute
  with StyleAttribute
  with TableAttribute
  with TBodyAttribute
  with TDAttribute
  with TextAreaAttribute
  with TFootAttribute
  with THAttribute
  with THeadAttribute
  with TimeAttribute
  with TRAttribute
  with TrackAttribute
  with VideoAttribute

object Attribute {
  case class AttributeFactory[T, A](f: T => A) {
    def :=(value: T): A = f(value)
  }

  case class Accept(value: String) extends FormAttribute with InputAttribute
  val accept = AttributeFactory(Accept)

  case class AcceptCharset(value: String) extends FormAttribute
  val acceptCharset = AttributeFactory(AcceptCharset)

  case class Action(value: String) extends FormAttribute
  val action = AttributeFactory(Action)

  case class Align(value: String) extends CaptionAttribute
    with ColAttribute
    with ColGroupAttribute
    with HRAttribute
    with IFrameAttribute
    with ImageAttribute
    with TableAttribute
    with TBodyAttribute
    with TDAttribute
    with TFootAttribute
    with THAttribute
    with THeadAttribute
    with TRAttribute
  val align = AttributeFactory(Align)

  case class Alternative(value: String) extends AreaAttribute
    with ImageAttribute
    with InputAttribute
  val alt = AttributeFactory(Alternative)

  case class Async(value: Boolean) extends ScriptAttribute
  val async = AttributeFactory(Async)

  case class AutoComplete(value: Boolean) extends FormAttribute with InputAttribute
  val autoComplete = AttributeFactory(AutoComplete)

  case class AutoFocus(value: Boolean) extends ButtonAttribute
    with InputAttribute
    with SelectAttribute
    with TextAreaAttribute
  val autoFocus = AttributeFactory(AutoFocus)

  case class AutoPlay(value: Boolean) extends AudioAttribute with VideoAttribute
  val autoplay = AttributeFactory(AutoPlay)

  case class Buffered(value: String) extends AudioAttribute with VideoAttribute
  val buffered = AttributeFactory(Buffered)

  case class Charset(value: String) extends MetaAttribute with ScriptAttribute
  val charset = AttributeFactory(Charset)

  case class Checked(value: String) extends CommandAttribute with InputAttribute
  val checked = AttributeFactory(Checked)

  case class Cite(value: String) extends BlockQuoteAttribute
    with DelAttribute
    with InsAttribute
    with QAttribute
  val cite = AttributeFactory(Cite)

  case class ClassName(value: String) extends GlobalAttribute
  val className = AttributeFactory(ClassName)

  case class Cols(value: String) extends TextAreaAttribute
  val cols = AttributeFactory(cols)

  case class ColSpan(value: String) extends TDAttribute with THAttribute
  val colspan = AttributeFactory(ColSpan)

  case class Content(value: String) extends MetaAttribute
  val content = AttributeFactory(Content)

  case class ContentEditable(value: String) extends GlobalAttribute
  val contenteditable = AttributeFactory(ContentEditable)

  case class ContextMenu(value: String) extends GlobalAttribute
  val contextmenu = AttributeFactory(ContextMenu)

  case class Controls(value: String) extends AudioAttribute with VideoAttribute
  val controls = AttributeFactory(Controls)

  case class CrossOrigin(value: String) extends AudioAttribute
    with ImageAttribute
    with LinkAttribute
    with ScriptAttribute
    with VideoAttribute
  val crossorigin = AttributeFactory(CrossOrigin)

  case class Data(value: String) extends ObjectAttribute
  val data = AttributeFactory(Data)

  case class CustomData(name: String, value: String) extends GlobalAttribute
  def data(name: String) = AttributeFactory((t: String) => CustomData(name, t))

  case class DateTime(value: String) extends DelAttribute
    with InsAttribute
    with TimeAttribute
  val datetime = AttributeFactory(DateTime)

  case class Default(value: String) extends TrackAttribute
  val default = AttributeFactory(Default)

  case class Defer(value: String) extends ScriptAttribute
  val defer = AttributeFactory(Defer)

  case class Dir(value: String) extends GlobalAttribute
  val dir = AttributeFactory(Dir)

  case class DirName(value: String) extends InputAttribute with TextAreaAttribute
  val dirname = AttributeFactory(DirName)

  case class Disabled(value: Boolean) extends ButtonAttribute
    with CommandAttribute
    with FieldSetAttribute
    with InputAttribute
    with OptGroupAttribute
    with OptionAttribute
    with SelectAttribute
    with TextAreaAttribute
  val disabled = AttributeFactory(Disabled)

  case class Download(value: String) extends AnchorAttribute with AreaAttribute
  val download = AttributeFactory(Download)

  case class Draggable(value: String) extends GlobalAttribute
  val draggable = AttributeFactory(Draggable)

  case class DropZone(value: String) extends GlobalAttribute
  val dropzone = AttributeFactory(DropZone)

  case class EncodingType(value: String) extends FormAttribute
  val enctype = AttributeFactory(EncodingType)

  case class For(value: String) extends LabelAttribute with OutputAttribute
  val `for` = AttributeFactory(For)

  case class Form(value: String) extends ButtonAttribute
    with FieldSetAttribute
    with InputAttribute
    with LabelAttribute
    with MeterAttribute
    with ObjectAttribute
    with OutputAttribute
    with ProgressAttribute
    with SelectAttribute
    with TextAreaAttribute
  val form = AttributeFactory(Form)

  case class FormAction(value: String) extends InputAttribute with ButtonAttribute
  val formaction = AttributeFactory(FormAction)

  case class Headers(name: String) extends TDAttribute with THAttribute
  val headers = AttributeFactory(Headers)

  case class Height(value: String) extends CanvasAttribute
    with EmbedAttribute
    with IFrameAttribute
    with ImageAttribute
    with InputAttribute
    with ObjectAttribute
    with VideoAttribute
  val height = AttributeFactory(Height)

  case class Hidden(value: Boolean) extends GlobalAttribute
  val hidden = AttributeFactory(Hidden)

  case class High(value: String) extends MeterAttribute
  val high = AttributeFactory(High)

  case class Href(value: String) extends AnchorAttribute
    with AreaAttribute
    with BaseAttribute
    with LinkAttribute
  val href = AttributeFactory(Href)

  case class HrefLanguage(value: String) extends AnchorAttribute
    with AreaAttribute
    with LinkAttribute
  val hreflang = AttributeFactory(HrefLanguage)

  case class HTTPEquiv(value: String) extends MetaAttribute
  val httpEquiv = AttributeFactory(HTTPEquiv)

  case class Id(value: String) extends GlobalAttribute
  val id = AttributeFactory(Id)

  case class Integrity(value: String) extends LinkAttribute with ScriptAttribute
  val integrity = AttributeFactory(Integrity)

  case class IsMap(value: String) extends ImageAttribute
  val ismap = AttributeFactory(IsMap)

  case class ItemProp(value: String) extends GlobalAttribute
  val itemprop = AttributeFactory(ItemProp)

  case class Kind(value: String) extends TrackAttribute
  val kind = AttributeFactory(Kind)

  case class Label(value: String) extends TrackAttribute
  val label = AttributeFactory(Label)

  case class Language(value: String) extends GlobalAttribute
  val lang = AttributeFactory(Language)

  case class ScriptingLanguage(value: String) extends ScriptAttribute
  val language = AttributeFactory(ScriptingLanguage)

  case class List(value: String) extends InputAttribute
  val list = AttributeFactory(List)

  case class Loop(value: String) extends AudioAttribute with VideoAttribute
  val loop = AttributeFactory(Loop)

  case class Low(value: String) extends MeterAttribute
  val low = AttributeFactory(Low)

  case class Manifest(value: String) extends HTMLAttribute
  val manifest = AttributeFactory(Manifest)

  case class Max(value: String) extends InputAttribute
    with MeterAttribute
    with ProgressAttribute
  val max = AttributeFactory(Max)

  case class MaxLength(value: String) extends InputAttribute with TextAreaAttribute
  val maxlength = AttributeFactory(MaxLength)

  case class MinLength(value: String) extends InputAttribute with TextAreaAttribute
  val minlength = AttributeFactory(MinLength)

  case class Media(value: String) extends AnchorAttribute
    with AreaAttribute
    with LinkAttribute
    with SourceAttribute
  val media = AttributeFactory(Media)

  case class Method(value: String) extends FormAttribute
  val method = AttributeFactory(Method)

  case class Min(value: String) extends InputAttribute with MeterAttribute
  val min = AttributeFactory(Min)

  case class Multiple(value: String) extends InputAttribute with SelectAttribute
  val multiple = AttributeFactory(Multiple)

  case class Muted(value: String) extends AudioAttribute with VideoAttribute
  val muted = AttributeFactory(Muted)

  case class Name(value: String) extends ButtonAttribute
    with FormAttribute
    with FieldSetAttribute
    with IFrameAttribute
    with InputAttribute
    with MapAttribute
    with MetaAttribute
    with ObjectAttribute
    with OutputAttribute
    with ParamAttribute
    with SelectAttribute
    with TextAreaAttribute
  val name = AttributeFactory(Name)

  case class NoValidate(value: String) extends FormAttribute
  val novalidate = AttributeFactory(NoValidate)

  case class Open(value: String) extends DetailsAttribute
  val open = AttributeFactory(Open)

  case class Optimum(value: String) extends MeterAttribute
  val optimum = AttributeFactory(Optimum)

  case class Pattern(value: String) extends InputAttribute
  val pattern = AttributeFactory(Pattern)

  case class Ping(value: String) extends AnchorAttribute with AreaAttribute
  val ping = AttributeFactory(Ping)

  case class Placeholder(value: String) extends InputAttribute with TextAreaAttribute
  val placeholder = AttributeFactory(Placeholder)

  case class Poster(value: String) extends VideoAttribute
  val poster = AttributeFactory(Poster)

  case class Preload(Value: String) extends AudioAttribute with VideoAttribute
  val preload = AttributeFactory(Preload)

  case class RadioGroup(value: String) extends AudioAttribute with VideoAttribute
  val radiogroup = AttributeFactory(RadioGroup)

  case class ReadOnly(value: String) extends InputAttribute with TextAreaAttribute
  val readonly = AttributeFactory(ReadOnly)

  case class Rel(value: String) extends AnchorAttribute
    with AreaAttribute
    with LinkAttribute
  val rel = AttributeFactory(Rel)

  case class Required(value: String) extends InputAttribute
    with SelectAttribute
    with TextAreaAttribute
  val required = AttributeFactory(Required)

  case class Reversed(value: String) extends OLAttribute
  val reversed = AttributeFactory(Reversed)

  case class Rows(value: String) extends TextAreaAttribute
  val rows = AttributeFactory(Rows)

  case class RowSpan(value: String) extends TDAttribute with THAttribute
  val rowspan = AttributeFactory(RowSpan)

  case class Sandbox(value: String) extends IFrameAttribute
  val sandbox = AttributeFactory(Sandbox)

  case class Scope(value: String) extends THAttribute
  val scope = AttributeFactory(Scope)

  case class Scoped(value: String) extends AnchorAttribute with AreaAttribute
  val scoped = AttributeFactory(Scoped)

  case class Seamless(value: String) extends IFrameAttribute
  val seamless = AttributeFactory(Seamless)

  case class Selected(value: String) extends OptionAttribute
  val selected = AttributeFactory(Selected)

  case class Shape(value: String) extends AnchorAttribute with AreaAttribute
  val shape = AttributeFactory(Shape)

  case class Size(value: String) extends InputAttribute with SelectAttribute
  val size = AttributeFactory(Size)

  case class Sizes(value: String) extends LinkAttribute
    with ImageAttribute
    with SourceAttribute
  val sizes = AttributeFactory(Sizes)

  case class Slot(value: String) extends GlobalAttribute
  val slot = AttributeFactory(Slot)

  case class Span(value: String) extends ColAttribute with ColGroupAttribute
  val span = AttributeFactory(Span)

  case class SpellCheck(value: String) extends GlobalAttribute
  val spellcheck = AttributeFactory(SpellCheck)

  case class Source(value: String) extends AudioAttribute
    with EmbedAttribute
    with IFrameAttribute
    with ImageAttribute
    with InputAttribute
    with ScriptAttribute
    with SourceAttribute
    with TrackAttribute
    with VideoAttribute
  val src = AttributeFactory(Source)

  case class SourceDocument(value: String) extends IFrameAttribute
  val srcdoc = AttributeFactory(SourceDocument)

  case class SourceLanguage(value: String) extends TrackAttribute
  val srclang = AttributeFactory(SourceLanguage)

  case class SourceSet(value: String) extends ImageAttribute
  val srcset = AttributeFactory(SourceSet)

  case class Start(value: String) extends OLAttribute
  val start = AttributeFactory(Start)

  case class Step(value: String) extends InputAttribute
  val step = AttributeFactory(Step)

  case class Style(value: String) extends GlobalAttribute
  val style = AttributeFactory(Style)

  case class Summary(value: String) extends TableAttribute
  val summary = AttributeFactory(Summary)

  case class TabIndex(value: String) extends GlobalAttribute
  val tabindex = AttributeFactory(TabIndex)

  case class Target(value: String) extends AnchorAttribute
    with AreaAttribute
    with BaseAttribute
    with FormAttribute
  val target = AttributeFactory(Target)

  case class Title(value: String) extends GlobalAttribute
  val title = AttributeFactory(Title)

  case class Type(value: String) extends ButtonAttribute
    with EmbedAttribute
    with InputAttribute
    with ObjectAttribute
    with ScriptAttribute
    with SourceAttribute
    with StyleAttribute
  val `type` = AttributeFactory(Type)

  case class UseMap(value: String) extends ImageAttribute
    with InputAttribute
    with ObjectAttribute
  val usemap = AttributeFactory(UseMap)

  case class Value(value: String) extends ButtonAttribute
    with InputAttribute
    with LIAttribute
    with MeterAttribute
    with OptionAttribute
    with ParamAttribute
    with ProgressAttribute
  val value = AttributeFactory(Value)

  case class Width(value: String) extends CanvasAttribute
    with EmbedAttribute
    with IFrameAttribute
    with ImageAttribute
    with InputAttribute
    with ObjectAttribute
    with VideoAttribute
  val width = AttributeFactory(Width)

  case class Wrap(value: String) extends TextAreaAttribute
  val wrap = AttributeFactory(Wrap)
}
