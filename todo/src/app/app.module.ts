import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { MatCardModule } from "@angular/material/card";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatButtonModule } from "@angular/material/button";
import { MatInputModule } from "@angular/material/input";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MatToolbarModule } from "@angular/material/toolbar";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { LoginComponent } from "./login/login.component";
import { ErrorComponent } from "./error/error.component";
import { HomeComponent } from "./homepage/home.component";
import { TodoListComponent } from "./todo-list/todo-list.component";
import { MenuComponent } from "./menu/menu.component";

import { LogoutComponent } from "./logout/logout.component";
import { TodoComponent } from "./todo/todo.component";
import { HTTP_INTERCEPTORS, HttpClientModule } from "@angular/common/http";
import { HttpInterceptorAuthService } from "./service/http/http-interceptor-auth.service";
import { SignupComponent } from "./signup/signup.component";
import { OrderByPipe } from "./utils/order-by.pipe";
import { MatTableModule } from "@angular/material/table";
import { MatIconModule } from "@angular/material/icon";
import { MatDatepickerModule } from "@angular/material/datepicker";
import { MatNativeDateModule } from "@angular/material/core";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    ErrorComponent,
    HomeComponent,
    TodoListComponent,
    MenuComponent,
    LogoutComponent,
    TodoComponent,
    SignupComponent,
    OrderByPipe,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    MatCardModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatTableModule,
    MatIconModule,
    MatDatepickerModule,
    MatNativeDateModule,
   
  ],
  exports: [MatCardModule, MatFormFieldModule, BrowserAnimationsModule],

  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: HttpInterceptorAuthService,
      multi: true,
    },
  ],
  bootstrap: [AppComponent],
})
export class AppModule {}
