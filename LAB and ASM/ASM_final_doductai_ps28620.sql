-- 1. Thêm thông tin vào các bảng
create or alter Procedure Them_NguoiDung
	@Ma_NguoiDung int,
	@Ten_NguoiDung nvarchar(50),
	@gioiTinh bit,
	@dienThoai nvarchar(20),
	@diaChi nvarchar(50),
	@quan nvarchar(50),
	@email varchar(50)
AS
	BEGIN TRY
		-- Mã người dùng
		IF @Ma_NguoiDung is null							
			BEGIN
				PRINT N'Mã người dùng không được để trống'
				RETURN
			END

		-- Tên người dùng
		IF @Ten_NguoiDung is null or @Ten_NguoiDung = ''	
			BEGIN
				PRINT N'Tên người dùng không được để trống'
				RETURN
			END

		-- Giới tính
		IF @gioiTinh is null
			BEGIN
				PRINT N'Giới tính người dùng không được để trống'
				RETURN
			END
		
		INSERT INTO NGUOIDUNG(MaND,TenND, GioiTinh, DienThoai, DiaChi, Quan, Email)
		VALUES(@Ma_NguoiDung, @Ten_NguoiDung, @gioiTinh, @dienThoai, @diaChi, @quan, @email)
	END TRY

	BEGIN CATCH
		PRINT ERROR_NUMBER()
		DECLARE @ER_Message nvarchar(2000),
				@ER_Severity int, 
				@ER_State int

		SELECT  @ER_Message = ERROR_MESSAGE(),
				@ER_Severity = ERROR_SEVERITY(),
				@ER_State = ERROR_STATE()
		
		IF ERROR_NUMBER() = 547
			SET @ER_Message = N'Thêm dữ liệu thất bại'
		IF ERROR_NUMBER() = 2627 -- 2627: Trùng Khóa Chính
			SET @ER_Message = N'Trùng Khóa Chính'
		IF ERROR_NUMBER() = 515 -- 515: Khóa Chính Bị Null
			SET @ER_Message = N'Khóa Chính Bị Null'
		IF ERROR_NUMBER() = 547 -- 547: Khóa Ngoại Không Tồn Tại
			SET @ER_Message = N'Khóa Ngoại Không Tồn Tại'

		RAISERROR(@ER_Message,@ER_Severity,@ER_State)
	END CATCH

create or alter Procedure them_NhaTro
	@Ma_NhaTro int,
	@Ma_LoaiNha int,
	@Dien_Tich real,
	@Gia_Phong money,
	@DiaChi_NhaTro nvarchar(50),
	@quan nvarchar(20),
	@ThongTin_NhaTro nvarchar(50),
	@Ngay_Dang date,
	@NguoiLH int
AS
	BEGIN TRY
		IF @Ma_NhaTro is null
			BEGIN
				PRINT N'Mã Nhà Trọ Không Được Để Trống'
				RETURN
			END

		IF @Ma_LoaiNha is null
			BEGIN
				PRINT N'Mã Loại Nhà Không Được Để Trống'
				RETURN
			END

		IF @Dien_Tich is null
			BEGIN
				PRINT N'Diện Tích Không Được Để Trống'
				RETURN
			END

		IF @Gia_Phong is null
			BEGIN
				PRINT N'Giá Phòng Không Được Để Trống'
				RETURN
			END

		IF @DiaChi_NhaTro is null
			BEGIN
				PRINT N'Địa Chỉ Nhà Trọ Không Được Để Trống'
				RETURN
			END

		IF @quan is null
			BEGIN
				PRINT N'Quận Không Được Để Trống'
				RETURN
			END

		IF @ThongTin_NhaTro is null
			BEGIN
				PRINT N'Thông Tin Nhà Trọ Không Được Để Trống'
				RETURN
			END

		IF @Ngay_Dang is null
			BEGIN
				PRINT N'Ngày Đăng Không Được Để Trống'
				RETURN
			END

		IF @NguoiLH is null
			BEGIN
				PRINT N'Người Liên Hệ Không Được Để Trống'
				RETURN
			END
	END TRY
	
	BEGIN CATCH
		PRINT ERROR_NUMBER()
		DECLARE @ER_MESSAGE nvarchar(2000),
				@ER_SEVERITY int,
				@ER_STATE int

		SELECT @ER_MESSAGE = ERROR_MESSAGE(),
			   @ER_SEVERITY = ERROR_SEVERITY(),
			   @ER_STATE = ERROR_STATE()

		IF ERROR_NUMBER() = 547
			SET @ER_Message = N'Thêm dữ liệu thất bại'
		IF ERROR_NUMBER() = 2627 -- 2627: Trùng Khóa Chính
			SET @ER_Message = N'Trùng Khóa Chính'
		IF ERROR_NUMBER() = 515 -- 515: Khóa Chính Bị Null
			SET @ER_Message = N'Khóa Chính Bị Null'
		IF ERROR_NUMBER() = 547 -- 547: Khóa Ngoại Không Tồn Tại
			SET @ER_Message = N'Khóa Ngoại Không Tồn Tại'

		RAISERROR(@ER_MESSAGE,@ER_SEVERITY,@ER_STATE)
	END CATCH

create or alter Procedure them_DanhGia
	@Ma_nhatro int,
	@Nguoi_DanhGia int,
	@Danh_Gia bit,
	@ThongTin_DanhGia nvarchar(50)
AS
	BEGIN TRY
		IF @Ma_nhatro is null
			BEGIN
				PRINT N'Mã Nhà Trọ Không Được Để Trống'
				RETURN
			END

		IF @Nguoi_DanhGia is null
			BEGIN
				PRINT N'Người Đánh Giá Không Được Để Trống'
				RETURN
			END

		IF @Danh_Gia is null
			BEGIN
				PRINT N'Đánh Giá Không Được Để Trống'
				RETURN
			END

		IF @ThongTin_DanhGia is null
			BEGIN
				PRINT N'Thông Tin Đánh Giá Không Được Để Trống'
				RETURN
			END
	END TRY

	BEGIN CATCH
		PRINT ERROR_NUMBER()
		DECLARE @ER_MESSAGE nvarchar(2000),
				@ER_SEVERITY int,
				@ER_STATE int

		SELECT @ER_MESSAGE = ERROR_MESSAGE(),
			   @ER_SEVERITY = ERROR_SEVERITY(),
			   @ER_STATE = ERROR_STATE()

		IF ERROR_NUMBER() = 547
			SET @ER_Message = N'Thêm dữ liệu thất bại'
		IF ERROR_NUMBER() = 2627 -- 2627: Trùng Khóa Chính
			SET @ER_Message = N'Trùng Khóa Chính'
		IF ERROR_NUMBER() = 515 -- 515: Khóa Chính Bị Null
			SET @ER_Message = N'Khóa Chính Bị Null'
		IF ERROR_NUMBER() = 547 -- 547: Khóa Ngoại Không Tồn Tại
			SET @ER_Message = N'Khóa Ngoại Không Tồn Tại'

		RAISERROR(@ER_MESSAGE,@ER_SEVERITY,@ER_STATE)
	END CATCH

-- ---------------------------------------------------------------------------- --
-- 2. Truy Vấn thông tin
-- a.
create or alter Procedure truyvan_NhaTro
	@quan nvarchar(20),
	@DienTich_Min real,
	@DienTich_Max real,
	@NgayDangTin_Old date,
	@NgayDangTin_New date,
	@GiaTien_Min money,
	@GiaTien_Max money,
	@LoaiHinh int
AS
	BEGIN
		SELECT N'Cho thuê phòng trọ tại '+ NHATRO.DiaChiNT + ', '+ NHATRO.Quan as 'Địa Chỉ Phòng Trọ',
			   CAST(FORMAT(DienTich,'#.#0 m2') as nvarchar) as 'Diện Tích',
			   CAST(FORMAT(GiaPhong,N'#,### đồng') as nvarchar) as 'Giá Phòng',
			   ThongTinNhaTro,
			   CAST(FORMAT(NgayDang,'dd-MM-yyyy') as nvarchar) as 'Ngày Đăng',
			   IIF(GioiTinh = 1,'A.' + TenND, 'C.'+ TenND) as 'Tên',
			   DienThoai,
			   NGUOIDUNG.DiaChi
		FROM NHATRO inner join NGUOIDUNG
		ON NHATRO.NguoiLienHe = NGUOIDUNG.MaND
		WHERE (@quan is null or NHATRO.Quan like N'%@quan%')  
			  and (@DienTich_Min is null or DienTich >= @DienTich_Min) and 
				  (@DienTich_Max is null or DienTich <= @DienTich_Max) 
			  and (@NgayDangTin_Old is null or NgayDang >= @NgayDangTin_Old) and 
				  (@NgayDangTin_New is null or NgayDang >= @NgayDangTin_New)
			  and (@GiaTien_Min is null or GiaPhong >= @GiaTien_Min) and
				  (@GiaTien_Max is null or GiaPhong >= @GiaTien_Max)
			  and (@LoaiHinh is null or NHATRO.MaLN = @LoaiHinh)
	END

EXECUTE truyvan_NhaTro null, 10, null, null, null, null, null, null

-- b.
create or alter Function truyvan_NguoiDung(
	@Ten_NguoiDung nvarchar(50),
	@gioitinh bit, 
	@dienthoai varchar(20),
	@diachi nvarchar(50),
	@quan nvarchar(20),
	@email nvarchar(20))
returns int
AS
	BEGIN
		RETURN (SELECT top 1 MaND
				FROM NGUOIDUNG
				WHERE (@Ten_NguoiDung is null or TenND = @Ten_NguoiDung)
					  and (@gioitinh is null or GioiTinh = @gioitinh)
					  and (@dienthoai is null or DienThoai = @dienthoai)
					  and (@diachi is null or DiaChi = @diachi)
					  and (@quan is null or Quan = @quan)
					  and (@email is null or Email = @email))
	END

-- c.
create or alter Function DanhGia_NhaTro(
	@Ma_NhaTro int)
returns table
AS
	RETURN SELECT @Ma_NhaTro as 'Mã Nhà Trọ',
		   SUM(IIF(DanhGia = 1,1,0)) as 'Like',
		   SUM(IIF(DanhGia = 0,1,0)) as 'Dislike'
		   FROM DANHGIA
		   WHERE MaNT = @Ma_NhaTro
SELECT * FROM DanhGia_NhaTro (10)

--d.
create or alter View Top10_NhaTro
AS
	SELECT DienTich, GiaPhong, ThongTinNhaTro, NgayDang, TenND, DiaChi, DienThoai, Email
	FROM NHATRO left join NGUOIDUNG
	ON NHATRO.NguoiLienHe = NGUOIDUNG.MaND
	WHERE MaNT in (select top 10 MaNT
				   from DANHGIA
				   group by MaNT
				   order by sum(iif(DanhGia = 1,1,0)) desc)

--e.
create or alter Procedure truyvan_MaNhaTro
	@Ma_Nha_Tro int,
	@Ten_NguoiDanhGia nvarchar(50),
	@Danh_Gia bit,
	@ThongTin_DanhGia nvarchar(50)
AS
	BEGIN
		SELECT @Ma_Nha_Tro as 'Mã Nhà Trọ',
			   @Ten_NguoiDanhGia as 'Tên Người Đánh Giá',
			   SUM(IIF(DanhGia = 1,1,0)) as 'Like',
			   SUM(IIF(DanhGia = 0,1,0)) as 'Dislike',
			   @ThongTin_DanhGia as 'Nội Dung Đánh Giá'
		FROM DANHGIA inner join NHATRO
		ON DANHGIA.MaNT = NHATRO.MaNT
		inner join NGUOIDUNG
		ON NGUOIDUNG.MaND = DANHGIA.NguoiDanhGia
		WHERE NHATRO.MaNT = @Ma_Nha_Tro		  
	END
GO
EXECUTE truyvan_MaNhaTro 1, Tú, 1, Hello

-- ---------------------------------------------------------------------------- --
-- 3. Xóa thông tin
create or alter Procedure xoa_NhaTro
	@soluong_Dislike int
AS
	BEGIN
		DECLARE @ds_NhaTro table(Ma_NT int)
		INSERT INTO @ds_NhaTro 
		SELECT MaNT
		FROM DANHGIA
		GROUP BY MaNT
		HAVING SUM(IIF(DanhGia = 0,1,0)) >= @soluong_Dislike
		SET xact_abort on
		BEGIN TRAN
		BEGIN TRY
			DELETE FROM DANHGIA
			WHERE MaNT in (select * from @ds_NhaTro)
			
			DELETE FROM NHATRO
			WHERE MaNT in (select * from @ds_NhaTro)
			COMMIT -- Thực thi 2 lệnh xóa
			PRINT N'Xóa Thành Công'
		END TRY

		BEGIN CATCH
			ROLLBACK TRAN
			PRINT N'Xóa Thất Bại'
		END CATCH
	END

EXECUTE xoa_NhaTro 1