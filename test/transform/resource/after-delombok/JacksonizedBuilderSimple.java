import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder.class)
class JacksonizedBuilderSimple<T> {
	private final int noshow = 0;
	private final int yes;
	private List<T> also;
	private int $butNotMe;
	@java.lang.SuppressWarnings("all")
	JacksonizedBuilderSimple(final int yes, final List<T> also) {
		this.yes = yes;
		this.also = also;
	}
	@java.lang.SuppressWarnings("all")
	@JsonIgnoreProperties(ignoreUnknown = true)
	@com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "", buildMethodName = "build")
	protected static class JacksonizedBuilderSimpleBuilder<T> {
		@java.lang.SuppressWarnings("all")
		private int yes;
		@java.lang.SuppressWarnings("all")
		private List<T> also;
		@java.lang.SuppressWarnings("all")
		JacksonizedBuilderSimpleBuilder() {
		}
		@java.lang.SuppressWarnings("all")
		public JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder<T> yes(final int yes) {
			this.yes = yes;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder<T> also(final List<T> also) {
			this.also = also;
			return this;
		}
		@java.lang.SuppressWarnings("all")
		public JacksonizedBuilderSimple<T> build() {
			return new JacksonizedBuilderSimple<T>(this.yes, this.also);
		}
		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder(yes=" + this.yes + ", also=" + this.also + ")";
		}
	}
	@java.lang.SuppressWarnings("all")
	protected static <T> JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder<T> builder() {
		return new JacksonizedBuilderSimple.JacksonizedBuilderSimpleBuilder<T>();
	}
}
