package song.mingu.grpc.server;


import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import song.mingu.grpc.lib.HelloGrpc;
import song.mingu.grpc.lib.HelloReply;
import song.mingu.grpc.lib.HelloRequest;

@GrpcService
public class GrpcServerService extends HelloGrpc.HelloImplBase {
    @Override
    public void sayHello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        HelloReply reply = HelloReply.newBuilder().setMessage("Hello ==> " + request.getName()).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
