import com.coxautodev.graphql.tools.GraphQLResolver;

public class SigninResolver implements GraphQLResolver {
    public User user(SigninPayload payload) {
        return payload.getUser();
    }
}
