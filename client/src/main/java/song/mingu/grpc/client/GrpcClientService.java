package song.mingu.grpc.client;

import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import song.mingu.grpc.lib.HelloGrpc.HelloBlockingStub;
import song.mingu.grpc.lib.HelloReply;
import song.mingu.grpc.lib.HelloRequest;

@Service
public class GrpcClientService {
    @GrpcClient("grpc-client")
    private HelloBlockingStub helloStub;

    public String sendMessage(final String name) {
        try {
            final HelloReply response = this.helloStub.sayHello(HelloRequest.newBuilder().setName(name).build());
            return response.getMessage();
        } catch (final StatusRuntimeException e) {
            return "FAILED with " + e.getStatus().getCode().name();
        }
    }
}
